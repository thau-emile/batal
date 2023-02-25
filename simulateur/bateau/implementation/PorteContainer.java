package simulateur.bateau.implementation;

import simulateur.bateau.BateauCivil;
import simulateur.bateau.Cargo;

/**
 * PorteContainer est une classe fille de BateauCivil et implémente Cargo
 * Il peut embarquer/décharger des passagers/des marchandises.
 * Obligation de lui fournir un tonnageMax dans le constructeur.
 */
public class PorteContainer extends BateauCivil implements Cargo {

    private final int tonnageMax;
    private int tonnageMarchandises = 0;

    public PorteContainer(String nom, int tonnageMax) {
        super(nom);
        this.tonnageMax = tonnageMax;
    }

    public PorteContainer(String nom, int ptDeVieMaxCoque, int tonnageMax) {
        super(nom, ptDeVieMaxCoque);
        this.tonnageMax = tonnageMax;
    }

    public int getTonnageMax() {
        return tonnageMax;
    }

    public int getTonnageMarchandises() {
        return tonnageMarchandises;
    }

    public void setTonnageMarchandises(int tonnageMarchandises) {
        this.tonnageMarchandises = tonnageMarchandises;
    }

    /**
     * Fait charger des marchandises au PorteContainer.
     * Le PorteContainer laissera à quai les marchandises dépassant ses capacités.
     *
     * @param tonnage : Masse de marchandises à embarquer, en tonnes.
     */
    @Override
    public void chargeTonnage(int tonnage) {
        int placeRestante = getTonnageMax() - getTonnageMarchandises();
        if (tonnage > placeRestante) {
            System.out.println("Je laisse " + (tonnage - placeRestante) + " tonnes à quai.");
            tonnage = placeRestante;
        }
        setTonnageMarchandises(tonnage);
        System.out.println(getNom() + " a chargé " + tonnage + " tonnes de marchandises.");
    }

    /**
     * Décharge toutes les marchandises du PorteContainer.
     */
    @Override
    public int dechargeTonnage() {
        int tonnage = getTonnageMarchandises();
        setTonnageMarchandises(0);
        System.out.println(getNom() + " a déchargé " + tonnage + " tonnes de marchandises.");
        return tonnage;
    }

}
