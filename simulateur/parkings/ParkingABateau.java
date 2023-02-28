package simulateur.parkings;

import java.util.ArrayList;
import java.util.Collections;

import simulateur.bateau.Bateau;

public class ParkingABateau {
    private final String nom;
    private int nbPlacesMax;
    private ArrayList<Bateau> bateauGares = new ArrayList<Bateau>();

    public ParkingABateau(String nom, int nbPlacesMax) {
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    public String getNom() {
        return nom;
    }

    public int getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(int nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    public ArrayList<Bateau> getBateauGares() {
        return bateauGares;
    }

    public void setBateauGares(ArrayList<Bateau> bateauGares) {
        this.bateauGares = bateauGares;
    }

    public boolean garerBateau(Bateau bateau) {
        if (getNbPlacesMax() > bateauGares.size()) {
            bateauGares.add(bateau);
            System.out.println("Bienvenue à " + getNom());
            bateau.arriveAuPort();
            ;
            return true;
        } else {
            System.out.println("J'ai pas la place pour ta poubelle flottante.");
            return false;
        }
    }

    public void departBateau(Bateau bateau) {
        if (getBateauGares().contains(bateau)) {
            getBateauGares().remove(bateau);
            bateau.prendLaMer();
            System.out.println("Ciao ! J'espère que vous avez apprécié votre séjour à " + getNom() + ".");
        } else {
            System.out.println("Jamais vu ton tas de ferraille !");
        }
    }

    public void displaySortBateauGares() {
        Collections.sort(getBateauGares());
        for (Bateau unBateau : getBateauGares()) {
            System.out.println(unBateau.getNom());
        }
    }

}
