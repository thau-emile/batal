package exercices.exo_bateau.simulateur.bateau;

public class Simulateur {
    public static void main(String[] args) {

        System.out.println(Bateau.getNombreDeBateauxConstruits());
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
        System.out.println(Bateau.getNombreDeBateauxConstruits());
    }
}
