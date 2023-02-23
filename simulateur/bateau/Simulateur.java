package exercices.exo_bateau.simulateur.bateau;

public class Simulateur {
        public static void main(String[] args) {

                System.out.println(Bateau.getNombreDeBateauxConstruits()
                                + " bateaux ont été construits");
                Bateau ohMonBateau = new Bateau("Titanic ça va bien se passer", 100);
                ohMonBateau.prendLaMer();
                ohMonBateau.navigue(30);
                ohMonBateau.navigue(12);
                ohMonBateau.arriveAuPort();
                ohMonBateau.prendLaMer();
                ohMonBateau.navigue(5);
                ohMonBateau.navigue(7.8);
                ohMonBateau.navigue(1.9);
                ohMonBateau.arriveAuPort();
                System.out.println(ohMonBateau.getNom() + " a présentement "
                                + ohMonBateau.getCoque().getPtDeVie() + " points de vie.");
                System.out.println(Bateau.getNombreDeBateauxConstruits()
                                + " bateaux ont été construits");
                Bateau bateau2 = new Bateau("Mon deuxième bateau");
                bateau2.setCoque(new Coque(12));
                System.out.println(bateau2.getNom() + " a présentement "
                                + bateau2.getCoque().getPtDeVie() + " points de vie.");
                Bateau bateau3 = new Bateau("Mon troisième bateau");
                System.out.println(Bateau.getNombreDeBateauxConstruits()
                                + " bateaux ont été construits");

        }
}
