package simulateur.bateau.piece;

public class Moteur {
    final Integer puissance;
    final Integer consommation;

    public Moteur(Integer puissance, Integer consommation) {
        this.puissance = puissance;
        this.consommation = consommation;
    }

    public Integer getPuissance() {
        return puissance;
    }

    public Integer getConsommation() {
        return consommation;
    }

}
