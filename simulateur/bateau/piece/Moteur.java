package exercices.exo_bateau.simulateur.bateau.piece;

public class Moteur {
    final int puissance;
    final int consommation;

    public Moteur(int puissance, int consommation) {
        this.puissance = puissance;
        this.consommation = consommation;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getConsommation() {
        return consommation;
    }

}
