package simulateur.bateau;

public class PorteContainer extends BateauCivil implements Cargo {

    private final int tonnageMax;
    private int tonnageMarchandises = 0;

    public PorteContainer(String nom) {
        super(nom);
        this.tonnageMax = 100;
    }

    public PorteContainer(String nom, int ptDeVieMaxCoque) {
        super(nom, ptDeVieMaxCoque);
        this.tonnageMax = 100;
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

    public void chargeTonnage(int tonnage) {
        int placeRestante = getTonnageMax() - getTonnageMarchandises();
        if (tonnage > placeRestante) {
            System.out.println("Je laisse " + (tonnage - placeRestante) + " à quai.");
            tonnage = placeRestante;
        }
        setTonnageMarchandises(tonnage);
        System.out.println(getNom() + " a chargé " + tonnage + " tonnes de marchandises.");
    }

    public int dechargeTonnage() {
        int tonnage = getTonnageMarchandises();
        setTonnageMarchandises(0);
        System.out.println(getNom() + " a déchargé " + tonnage + " tonnes de marchandises.");
        return tonnage;
    }

}
