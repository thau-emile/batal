package simulateur;

import simulateur.bateau.Bateau;

public class Controleur {

    public void controle(Bateau bateau) {
        bateau.prendLaMer();
        bateau.navigue(42);
        bateau.arriveAuPort();
    }

}
