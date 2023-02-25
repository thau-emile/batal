package simulateur.bateau.implementation;

import simulateur.bateau.BateauMilitaire;
import simulateur.bateau.Cargo;

public class Ravitailleur extends BateauMilitaire implements Cargo {

    private final int tonnageMax;
    private int tonnagePetrole = 0;

    public Ravitailleur(String nom, int tonnageMax) {
        super(nom);
        this.tonnageMax = tonnageMax;
    }

    public Ravitailleur(String nom, int ptDeVieMaxCoque, int tonnageMax) {
        super(nom, ptDeVieMaxCoque);
        this.tonnageMax = tonnageMax;
    }

    public Ravitailleur(String nom, int ptDeVieMaxCoque, int forceCanon, int tonnageMax) {
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

    public void chargeTonnage(int tonnage) {
        int placeRestante = getTonnageMax() - getTonnagePetrole();
        if (tonnage > placeRestante) {
            System.out.println("Je laisse " + (tonnage - placeRestante) + " tonnes de pétrole sur place.");
            tonnage = placeRestante;
        }
        setTonnagePetrole(tonnage);
        System.out.println(getNom() + " a chargé " + tonnage + " tonnes de pétrole.");
    }

    public int dechargeTonnage() {
        int tonnage = getTonnagePetrole();
        setTonnagePetrole(0);
        System.out.println(getNom() + " a déchargé " + tonnage + " tonnes de pétrole.");
        return tonnage;
    }

}
