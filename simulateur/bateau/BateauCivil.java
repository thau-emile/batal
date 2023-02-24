package simulateur.bateau;

/**
 * BateauCivil simule un Bateau qui peut embarquer des passagers, naviguer, puis
 * les débarquer.
 */
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

    /**
     * Le navire arrive au port et débarque tout ses passagers.
     * Redéfini arriveAuPort de la classe mère Bateau
     */
    @Override
    public void arriveAuPort() {
        super.arriveAuPort();
        System.out.println("Je décharge " + this.getNbCivils() + " passagers.");
        this.setNbCivils(0);
    }

    /**
     * Fait naviguer le bateau civil avec des passagers
     *
     * @param miles : combien de miles parcourus par cette navigation
     */
    @Override
    public void navigue(double miles) {
        super.navigue(miles);
        System.out.println("Je navigue avec " + this.getNbCivils() + " passagers à bord.");
    }

    /**
     * Prend la mer en embarquant par défaut 0 passagers.
     * Redéfini prendLaMer de la classe mère Bateau
     */
    @Override
    public void prendLaMer() {
        super.prendLaMer();
        this.setNbCivils(0); // par defaut
        System.out.println("Je prends la mer avec " + this.getNbCivils() + " passagers à bord.");
    }

    /**
     * Prend la mer en embarquant des passagers
     *
     * @param nbCivilsEmbarques : nombre de passagers embarqués
     */
    public void prendLaMer(int nbCivilsEmbarques) {
        super.prendLaMer();
        this.setNbCivils(nbCivilsEmbarques); // par defaut
        System.out.println("Je prends la mer avec " + this.getNbCivils() + " passagers à bord.");
    }

}
