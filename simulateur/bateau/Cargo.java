package simulateur.bateau;

/**
 * Cargo est une Interface décrivant le comportement d'un véhicule embarquant
 * des marchandises/du matériel/fluides.
 */
public interface Cargo {

    void chargeTonnage(int tonnage);

    int dechargeTonnage();
}
