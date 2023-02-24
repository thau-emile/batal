package simulateur.bateau;

public class BateauCivil extends Bateau {

    private int nbCivils;

    public int getNbCivils() {
        return this.nbCivils;
    }

    public void setNbCivils(int nbCivils) {
        this.nbCivils = nbCivils;
    }

    public BateauCivil(String nom) {
        super(nom);
    }

    public BateauCivil(String nom, int ptDeVieMaxCoque) {
        super(nom, ptDeVieMaxCoque);
    }

    @Override
    public void arriveAuPort() {
        super.arriveAuPort();
        System.out.println("Je décharge " + this.getNbCivils() + " passagers.");
        this.setNbCivils(0);
    }

    @Override
    public void navigue(double miles) {
        super.navigue(miles);
        System.out.println("Je navigue avec " + this.getNbCivils() + " passagers à bord.");
    }

    @Override
    public void prendLaMer() {
        super.prendLaMer();
        this.setNbCivils(0); // par defaut
        System.out.println("Je prends la mer avec " + this.getNbCivils() + " passagers à bord.");
    }

    public void prendLaMer(int nbCivilsEmbarques) {
        super.prendLaMer();
        this.setNbCivils(nbCivilsEmbarques); // par defaut
        System.out.println("Je prends la mer avec " + this.getNbCivils() + " passagers à bord.");
    }

}
