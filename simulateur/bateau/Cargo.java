package simulateur.bateau;

/**
 * Cargo est une Interface décrivant le comportement d'un véhicule embarquant
 * des marchandises.
 */
public interface Cargo {

    void chargeTonnage(int tonnage);

    int dechargeTonnage();
}
