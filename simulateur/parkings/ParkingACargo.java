package simulateur.parkings;

import java.util.ArrayList;

import simulateur.bateau.Cargo;

public class ParkingACargo {
    private final String nom;
    private int nbPlacesMax;
    private ArrayList<Cargo> cargoGares = new ArrayList<Cargo>();

    public ParkingACargo(String nom, int nbPlacesMax) {
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

    public ArrayList<Cargo> getCargoGares() {
        return cargoGares;
    }

    public void setCargoGares(ArrayList<Cargo> cargoGares) {
        this.cargoGares = cargoGares;
    }

    public boolean garerCargo(Cargo cargo) {
        if (getNbPlacesMax() > cargoGares.size()) {
            cargoGares.add(cargo);
            System.out.println("Bienvenue à " + getNom());
            cargo.dechargeTonnage();
            return true;
        } else {
            System.out.println("J'ai pas la place pour ta poubelle flottante.");
            return false;
        }
    }

    public void departCargo(Cargo cargo, int tonnageACharger) {
        if (getCargoGares().contains(cargo)) {
            getCargoGares().remove(cargo);
            cargo.chargeTonnage(tonnageACharger);
            System.out.println("Ciao ! J'espère que vous avez apprécié votre séjour à " + getNom() + ".");
        } else {
            System.out.println("Jamais vu ton tas de ferraille !");
        }
    }

}
