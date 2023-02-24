package simulateur;

import simulateur.bateau.Bateau;

/**
 * Controleur : permet de faire faire un tour d'essai à un Bateau.
 */
public class Controleur {

    public void controle(Bateau bateau) {
        bateau.prendLaMer();
        bateau.navigue(42);
        bateau.arriveAuPort();
    }

}
