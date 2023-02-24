package simulateur.bateau;

import simulateur.bateau.piece.Coque;
import simulateur.bateau.piece.Moteur;

/**
 * Bateau simule un... bateau.
 */
public class Bateau {
    private final String nom;
    private double milesParcourus = 0;
    private static int nombreDeBateauxConstruits = 0;
    private Coque coque;
    private Moteur moteur;
    // private final int countDown = 42;

    /**
     * Construit un Bateau sans Coque.
     *
     * @param nom : son nom définitif
     */
    public Bateau(String nom) {
        this.nom = nom;
        this.coque = new Coque(100); // Coque par défaut
        Bateau.nombreDeBateauxConstruits++;
    }

    /**
     * Construit un bateau avec une coque
     *
     * @param nom             : son nom définitif
     * @param ptDeVieMaxCoque : initialise ptDeVie et ptDeVieMax de la coque du
     *                        bateau créé
     */
    public Bateau(String nom, int ptDeVieMaxCoque) {
        this.nom = nom;
        this.coque = new Coque(ptDeVieMaxCoque);
        Bateau.nombreDeBateauxConstruits++;
    }

    public String getNom() {
        return this.nom;
    }

    public double getMilesParcourus() {
        return this.milesParcourus;
    }

    public void setMilesParcourus(double milesParcourus) {
        this.milesParcourus = milesParcourus;
    }

    public static int getNombreDeBateauxConstruits() {
        return Bateau.nombreDeBateauxConstruits;
    }

    public static void setNombreDeBateauxConstruits(int nombreDeBateauxConstruits) {
        Bateau.nombreDeBateauxConstruits = nombreDeBateauxConstruits;
    }

    public Coque getCoque() {
        return this.coque;
    }

    public void setCoque(Coque coque) {
        this.coque = coque;
    }

    /**
     * Le navire prends la mer.
     */
    public void prendLaMer() {
        System.out.println(this.getNom() + " prend la mer.");
    }

    /**
     * Fait naviguer le bateau
     *
     * @param miles : combien de miles parcourus par cette navigation
     */
    public void navigue(double miles) {
        this.setMilesParcourus(this.getMilesParcourus() + miles);
        System.out.printf(this.getNom() +
                " parcourt %.2f miles.\n",
                this.getMilesParcourus());
    }

    /**
     * Simule l'arrivée du bateau au port.
     * Affiche les miles parcourus depuis le départ, uis les reset.
     */
    public void arriveAuPort() {
        System.out.printf(this.getNom() +
                " a parcouru %.2f miles lors de sa sortie en mer.\n",
                this.getMilesParcourus());
        this.setMilesParcourus(0);
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

}
