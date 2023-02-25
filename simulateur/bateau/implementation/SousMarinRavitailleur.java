package simulateur.bateau.implementation;

import simulateur.bateau.BateauMilitaire;
import simulateur.bateau.Cargo;
import simulateur.bateau.Submersible;

/**
 * SousMarinRavitailleur est une classe fille de BateauMilitaire et implémente
 * Cargo et Submersible
 * Il a un canon (force par défaut : 0)
 * Il peut plonger/faire surface.
 * Il peut embarquer/décharger du pétrole.
 * Obligation de lui fournir un tonnageMax dans le constructeur.
 */
public class SousMarinRavitailleur extends BateauMilitaire implements Cargo, Submersible {

    private final int tonnageMax;
    private int tonnagePetrole = 0;
    private boolean sousLEau = false;

    public SousMarinRavitailleur(String nom, int tonnageMax) {
        super(nom);
        this.tonnageMax = tonnageMax;
    }

    public SousMarinRavitailleur(String nom, int ptDeVieMaxCoque, int tonnageMax) {
        super(nom, ptDeVieMaxCoque);
        this.tonnageMax = tonnageMax;
    }

    public SousMarinRavitailleur(String nom, int ptDeVieMaxCoque, int forceCanon, int tonnageMax) {
        super(nom, ptDeVieMaxCoque, forceCanon);
        this.tonnageMax = tonnageMax;
    }

    public int getTonnageMax() {
        return tonnageMax;
    }

    public int getTonnagePetrole() {
        return tonnagePetrole;
    }

    public void setTonnagePetrole(int tonnagePetrole) {
        this.tonnagePetrole = tonnagePetrole;
    }

    public boolean isSousLEau() {
        return sousLEau;
    }

    public void setSousLEau(boolean sousLEau) {
        this.sousLEau = sousLEau;
    }

    /**
     * Fait charger du pétrole au SousMarinRavitailleur.
     * Le SousMarinRavitailleur laissera sur place le pétrole dépassant ses
     * capacités.
     *
     * @param tonnage : Masse de pétrole à embarquer, en tonnes.
     */
    @Override
    public void chargeTonnage(int tonnage) {
        int placeRestante = getTonnageMax() - getTonnagePetrole();
        if (tonnage > placeRestante) {
            System.out.println("Je laisse " + (tonnage - placeRestante) + " tonnes de pétrole sur place.");
            tonnage = placeRestante;
        }
        setTonnagePetrole(tonnage);
        System.out.println(getNom() + " a chargé " + tonnage + " tonnes de pétrole.");
    }

    /**
     * Décharge tout le pétrole du SousMarinRavitailleur.
     */
    @Override
    public int dechargeTonnage() {
        int tonnage = getTonnagePetrole();
        setTonnagePetrole(0);
        System.out.println(getNom() + " a déchargé " + tonnage + " tonnes de pétrole.");
        return tonnage;
    }

    /**
     * Fait remonter à la surface le SousMarinRavitailleur.
     */
    @Override
    public void faitSurface() {
        if (isSousLEau()) {
            System.out.println(getNom() + " fait surface.");
            setSousLEau(false);
        } else {
            System.out.println(getNom() + " est déjà à la surface.");
        }
    }

    /**
     * Fait plonger sous l'eau le SousMarinRavitailleur.
     */
    @Override
    public void plonge() {
        if (!isSousLEau()) {
            System.out.println(getNom() + " plonge.");
            setSousLEau(true);
        } else {
            System.out.println(getNom() + " est déjà en plongée.");
        }
    }

}
