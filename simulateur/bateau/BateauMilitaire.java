package simulateur.bateau;

public class BateauMilitaire extends Bateau {

    private int forceCanon;

    public BateauMilitaire(String nom) {
        super(nom);
    }

    public BateauMilitaire(String nom, int ptDeVieMaxCoque) {
        super(nom, ptDeVieMaxCoque);
    }

    public BateauMilitaire(String nom, int ptDeVieMaxCoque, int forceCanon) {
        super(nom, ptDeVieMaxCoque);
        this.forceCanon = forceCanon;
    }

    public int getForceCanon() {
        return this.forceCanon;
    }

    public void setForceCanon(int forceCanon) {
        this.forceCanon = forceCanon;
    }

    @Override
    public void arriveAuPort() {
        super.arriveAuPort();
        System.out.println("J'arrive au port avec mon canon de force : "
                + this.forceCanon);
    }

    @Override
    public void navigue(double miles) {
        super.navigue(miles);
        System.out.println("Je navigue avec mon canon de force : "
                + this.forceCanon);
    }

    @Override
    public void prendLaMer() {
        super.prendLaMer();
        System.out.println("Je prends la mer avec mon canon de force : "
                + this.forceCanon);
    }

    public void attaque(Bateau cible) {

    }

}
