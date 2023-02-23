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
        System.out.println(this.nom + " prend la mer.");
        return true;
    }

    public void navigue(double miles) {
        this.milesParcourus += miles;
        System.out.printf(this.nom +
                " parcourt %.2f miles.\n",
                this.milesParcourus);
    }

    public void arriveAuPort() {
        System.out.printf(this.nom +
                " a parcouru %.2f miles lors de sa sortie en mer.\n",
                this.milesParcourus);
        this.milesParcourus = 0;
    }

    public Bateau() {
        Bateau.nombreDeBateauxConstruits++;
    }

    public Bateau(String nom) {
        this.nom = nom;
        Bateau.nombreDeBateauxConstruits++;
    }

    public static void main(String[] args) {

        System.out.println(Bateau.nombreDeBateauxConstruits);
        Bateau ohMonBateau = new Bateau("Titanic ça va bien se passer");
        ohMonBateau.prendLaMer();
        ohMonBateau.navigue(30);
        ohMonBateau.navigue(12);
        ohMonBateau.arriveAuPort();
        ohMonBateau.prendLaMer();
        ohMonBateau.navigue(5);
        ohMonBateau.navigue(7.8);
        ohMonBateau.navigue(1.9);
        ohMonBateau.arriveAuPort();
        System.out.println(Bateau.nombreDeBateauxConstruits);
    }

}
