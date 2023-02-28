package simulateur;

import simulateur.bateau.Bateau;
import simulateur.bateau.BateauCivil;
import simulateur.bateau.BateauMilitaire;
import simulateur.bateau.implementation.PorteContainer;
import simulateur.bateau.implementation.Ravitailleur;
import simulateur.bateau.implementation.SousMarinAttaque;
import simulateur.bateau.implementation.SousMarinRavitailleur;
import simulateur.bateau.piece.Coque;
import simulateur.bateau.piece.Moteur;
import simulateur.parkings.ParkingABateau;
import simulateur.parkings.ParkingACargo;

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

                // test ajout d'un Moteur (non utilisé par ailleurs)
                Moteur monMoteur = new Moteur(200, 8);
                ohMonBateau.setMoteur(monMoteur);

                // test de BateauCivil et BateauMilitaire
                BateauCivil monBateauCivil = new BateauCivil("Belem", 25);
                BateauMilitaire hermione = new BateauMilitaire("Hermione",
                                150, 23);

                Controleur leControleurDeBateaux = new Controleur();
                leControleurDeBateaux.controle(monBateauCivil);
                leControleurDeBateaux.controle(hermione);

                hermione.attaque(monBateauCivil);

                // test de PorteContainer
                PorteContainer dePlacard = new PorteContainer("Vous l'avez ?", 50, 500);
                leControleurDeBateaux.controle(dePlacard);
                dePlacard.chargeTonnage(600);
                dePlacard.dechargeTonnage();

                // test de Ravitailleur
                Ravitailleur dePierre = new Ravitailleur("Erikrieg", 20, 1, 8000);
                leControleurDeBateaux.controle(dePierre);
                dePierre.chargeTonnage(9000);
                dePierre.dechargeTonnage();
                dePierre.attaque(dePlacard); // Pew ! Pew !

                // test de SousMarinAttaque
                SousMarinAttaque bob = new SousMarinAttaque("Salade Iceberg", 87, 115);
                leControleurDeBateaux.controle(bob);
                bob.plonge(); // qui vit dans un ananas sous la mer ?
                bob.plonge();
                bob.faitSurface();
                bob.faitSurface();
                bob.attaque(ohMonBateau);

                // test de SousMarinRavitailleur
                SousMarinRavitailleur aquabarman = new SousMarinRavitailleur("Blue Edith", 25, 15, 547);
                leControleurDeBateaux.controle(aquabarman);
                aquabarman.plonge();
                aquabarman.plonge();
                aquabarman.faitSurface();
                aquabarman.faitSurface();
                aquabarman.chargeTonnage(600);
                aquabarman.dechargeTonnage();

                // test du polymorphisme sur Cargo via le ParkingACargo
                ParkingACargo leHavre = new ParkingACargo("Port Moche", 1);
                leHavre.garerCargo(dePlacard);
                leHavre.garerCargo(aquabarman);
                leHavre.departCargo(dePlacard, 700);

                // test de sort
                ParkingABateau laRochelle = new ParkingABateau("Port des Minimes", 25);
                laRochelle.garerBateau(ohMonBateau);
                laRochelle.garerBateau(bateau2);
                laRochelle.garerBateau(bateau3);
                laRochelle.garerBateau(dePierre);
                laRochelle.garerBateau(bob);

                laRochelle.displaySortBateauGares();

        }
}
