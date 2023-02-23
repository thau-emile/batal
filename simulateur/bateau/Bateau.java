package exercices.exo_bateau.simulateur.bateau;

public class Bateau {
    private final String nom;
    private double milesParcourus = 0;
    private static int nombreDeBateauxConstruits = 0;
    private Coque coque;
    private final int countDown = 42;

    // public Bateau() {
    // this.nom = "Un nom bateau.";
    // Bateau.setNombreDeBateauxConstruits(Bateau.getNombreDeBateauxConstruits() +
    // 1);
    // }

    public Bateau(String nom) {
        this.nom = nom;
        Bateau.setNombreDeBateauxConstruits(Bateau.getNombreDeBateauxConstruits() + 1);
    }

    public Bateau(String nom, int ptDeVieMaxCoque) {
        this.nom = nom;
        this.setCoque(new Coque(ptDeVieMaxCoque));
        Bateau.setNombreDeBateauxConstruits(Bateau.getNombreDeBateauxConstruits() + 1);
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

    public boolean prendLaMer() {
        System.out.println(this.getNom() + " prend la mer.");
        return true;
    }

    public void navigue(double miles) {
        this.setMilesParcourus(this.getMilesParcourus() + miles);
        System.out.printf(this.getNom() +
                " parcourt %.2f miles.\n",
                this.getMilesParcourus());
    }

    public void arriveAuPort() {
        System.out.printf(this.getNom() +
                " a parcouru %.2f miles lors de sa sortie en mer.\n",
                this.getMilesParcourus());
        this.setMilesParcourus(0);
    }

}
