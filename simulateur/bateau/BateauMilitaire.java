package simulateur.bateau;

import simulateur.bateau.piece.Coque;

public class BateauMilitaire extends Bateau {

    private int forceCanon; // 0 par défaut

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
                + this.getForceCanon());
    }

    @Override
    public void navigue(double miles) {
        super.navigue(miles);
        System.out.println("Je navigue avec mon canon de force : "
                + this.getForceCanon());
    }

    @Override
    public void prendLaMer() {
        super.prendLaMer();
        System.out.println("Je prends la mer avec mon canon de force : "
                + this.getForceCanon());
    }

    public void attaque(Bateau cible) {
        System.out.println(this.getNom() + " attaque " + cible.getNom());
        Coque coqueCible = cible.getCoque();
        int newPtDeVie = coqueCible.getPtDeVie() - this.getForceCanon();
        if (newPtDeVie > 0) {
            coqueCible.setPtDeVie(newPtDeVie);
            System.out.println("Il reste " + newPtDeVie + " points de vie à " + cible.getNom() + ".");
        } else {
            coqueCible.setPtDeVie(0);
            System.out.println(cible.getNom() + "coule.");
        }
    }

}
