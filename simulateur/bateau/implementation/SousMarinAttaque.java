package simulateur.bateau.implementation;

import simulateur.bateau.BateauMilitaire;
import simulateur.bateau.Submersible;;

/**
 * SousMarinAttaque est une classe fille de BateauMilitaire et implémente
 * Submersible
 * Il a un canon (force par défaut : 0)
 * Il peut plonger/faire surface.
 */
public class SousMarinAttaque extends BateauMilitaire implements Submersible {

    private boolean sousLEau = false;

    public SousMarinAttaque(String nom) {
        super(nom);
    }

    public SousMarinAttaque(String nom, int ptDeVieMaxCoque) {
        super(nom, ptDeVieMaxCoque);
    }

    public SousMarinAttaque(String nom, int ptDeVieMaxCoque, int forceCanon) {
        super(nom, ptDeVieMaxCoque, forceCanon);
    }

    public boolean isSousLEau() {
        return sousLEau;
    }

    public void setSousLEau(boolean estSousLEau) {
        this.sousLEau = estSousLEau;
    }

    /**
     * Fait remonter à la surface le SousMarinAttaque.
     */
    @Override
    public void faitSurface() {
        if (isSousLEau()) {
            System.out.println(getNom() + " fait surface.");
            setSousLEau(false);
        } else {
            System.out.println(getNom() + " est déjà à la surface.");
        }
    }

    /**
     * Fait plonger sous l'eau le SousMarinAttaque.
     */
    @Override
    public void plonge() {
        if (!isSousLEau()) {
            System.out.println(getNom() + " plonge.");
            setSousLEau(true);
        } else {
            System.out.println(getNom() + " est déjà en plongée.");
        }
    }

}
