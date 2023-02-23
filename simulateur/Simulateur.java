package exercices.exo_bateau.simulateur;

import exercices.exo_bateau.simulateur.bateau.Bateau;
import exercices.exo_bateau.simulateur.bateau.piece.Coque;

public class Simulateur {
        public static void main(String[] args) {

                // affiche le nombre de bateaux construits
                System.out.println(Bateau.getNombreDeBateauxConstruits()
                                + " bateaux ont été construits");
                // Construit un bateau avec une coque
                Bateau ohMonBateau = new Bateau("Titanic ça va bien se passer", 100);
                // Les incroyables aventures du Titanic ça va bien se passer
                ohMonBateau.prendLaMer();
                ohMonBateau.navigue(30);
                ohMonBateau.navigue(12);
                ohMonBateau.arriveAuPort();
                ohMonBateau.prendLaMer();
                ohMonBateau.navigue(5);
                ohMonBateau.navigue(7.8);
                ohMonBateau.navigue(1.9);
                ohMonBateau.arriveAuPort();
                // affiche les ptDeVie du bateau
                System.out.println(ohMonBateau.getNom() + " a présentement "
                                + ohMonBateau.getCoque().getPtDeVie() + " points de vie.");
                // affiche le nombre de bateaux construits
                System.out.println(Bateau.getNombreDeBateauxConstruits()
                                + " bateaux ont été construits");
                // je construis d'autres bateaux
                Bateau bateau2 = new Bateau("Mon deuxième bateau");
                bateau2.setCoque(new Coque(12));
                System.out.println(bateau2.getNom() + " a présentement "
                                + bateau2.getCoque().getPtDeVie() + " points de vie.");
                Bateau bateau3 = new Bateau("Mon troisième bateau");
                // affiche le nombre de bateaux construits
                System.out.println(Bateau.getNombreDeBateauxConstruits()
                                + " bateaux ont été construits");

        }
}
