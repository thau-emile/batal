package exercices.exo_bateau.simulateur.bateau;

public class Bateau {
    private String nom;
    private double milesParcourus = 0;
    private static int nombreDeBateauxConstruits = 0;

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public boolean prendLaMer() {
        return true;
    }

    public void navigue(double miles) {
        this.milesParcourus += miles;
    }

    public void arriveAuPort() {
        System.out.printf("%.2f\n", this.milesParcourus);
        this.milesParcourus = 0;
    }

    public static void main(String[] args) {
        Bateau ohMonBateau = new Bateau();
        ohMonBateau.prendLaMer();
        ohMonBateau.navigue(30);
        ohMonBateau.navigue(12);
        ohMonBateau.arriveAuPort();
        ohMonBateau.prendLaMer();
        ohMonBateau.navigue(5);
        ohMonBateau.navigue(7.8);
        ohMonBateau.navigue(1.9);
        ohMonBateau.arriveAuPort();
    }

}
