package simulateur.bateau;

import simulateur.bateau.piece.Coque;

/**
 * BateauMilitaire simule un Bateau avec un canon.
 */
public class BateauMilitaire extends Bateau {

    /**
     * Force du canon. 0 par défaut.
     */
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
                + getForceCanon());
    }

    @Override
    public void navigue(double miles) {
        super.navigue(miles);
        System.out.println("Je navigue avec mon canon de force : "
                + getForceCanon());
    }

    @Override
    public void prendLaMer() {
        super.prendLaMer();
        System.out.println("Je prends la mer avec mon canon de force : "
                + getForceCanon());
    }

    /**
     * Attaque un autre bateau.
     * Lui retire un nombre de points de vie égal à la force du canon de
     * l'attaquant.
     *
     * @param cible : bateau ciblé par l'attaque.
     */
    public void attaque(Bateau cible) {
        System.out.println(getNom() + " attaque " + cible.getNom());
        Coque coqueCible = cible.getCoque();
        int newPtDeVie = coqueCible.getPtDeVie() - getForceCanon();
        if (newPtDeVie > 0) {
            coqueCible.setPtDeVie(newPtDeVie);
            System.out.println("Il reste " + newPtDeVie + " points de vie à " + cible.getNom() + ".");
        } else {
            coqueCible.setPtDeVie(0);
            System.out.println(cible.getNom() + " coule.");
        }
    }

}
