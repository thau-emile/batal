package exercices.exo_bateau.simulateur.bateau;

/**
 * Coque simule la coque d'un bateau.
 */
public class Coque {
    private int ptDeVie;
    private int ptDeVieMax;

    /**
     * Constructeur de Coque. Genre Naval Group.
     *
     * @param initPtDeVieMax initialise ptDeVie et ptDeVieMax
     */
    public Coque(int initPtDeVieMax) {
        this.ptDeVie = initPtDeVieMax;
        this.ptDeVieMax = initPtDeVieMax;
    }

    public int getPtDeVie() {
        return this.ptDeVie;
    }

    public void setPtDeVie(int ptDeVie) {
        this.ptDeVie = ptDeVie;
    }

    public int getPtDeVieMax() {
        return this.ptDeVieMax;
    }

    public void setPtDeVieMax(int ptDeVieMax) {
        this.ptDeVieMax = ptDeVieMax;
    }

}
