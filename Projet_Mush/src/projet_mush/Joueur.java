/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_mush;

/**
 *
 * @author Justine
 */

    import java.util.Arrays;

public class Joueur {
    private String pseudo;
    private Personnage personnage;
    private Boolean mush; // Mush = Vrai par dÃ©faut
    private int pV; //=Point de vie
    private int pMO; //=Point de mouvement
    private int pM; //=Point de morale
    private int pA; //=Point d'action
    private int spore;
    private int inventaire[] = new int[3];
    private String localisation;

    public Joueur(String pseudo, Personnage p, boolean mush) {
        this.pseudo = pseudo;
        this.personnage = p;
        this.mush = mush;
        this.pV = 14; //max
        this.pMO = 7; //14max
        this.pM = 12; //max
        this.pA = 12; //max
        this.spore = 0; //3max = devient mush
        this.init();
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public Personnage getPersonnage() {
        return this.personnage;
    }

    public boolean getMush() {
        return this.mush;
    }

    public void setMush(boolean m) {
        this.mush = m;
    }

    public int getpV() {
        return this.pV;
    }

    public void setpV(int pV) {
        this.pV = pV;
    }

    public int getpMO() {
        return this.pMO;
    }

    public void setpMO(int pMO) {
        this.pMO = pMO;
    }

    public int getpM() {
        return this.pM;
    }

    public void setpM(int pM) {
        this.pM = pM;
    }

    public int getpA() {
        return this.pA;
    }

    public void setpA(int pA) {
        this.pA = pA;
    }

    public int getSpore() {
        return this.spore;
    }

    public void setSpore(int spore) {
        this.spore = spore;
    }

    public int[] getInventaire() {
        return this.inventaire;
    }

    public void setInventaire(int[] inventaire) {
        this.inventaire = inventaire;
    }

    public void init() {
        for (int i = 0; i < 3; i++) {
            this.inventaire[i] = 0;
        }
    }

    public String toString() {
        if (this.mush == true) {
            return this.pseudo + " : " + this.pV + " PV, " + this.pA + " PA, " + this.pM + " PM, " + this.pMO + " PMO, contenu de l'inventaire " + Arrays.toString(this.inventaire) + ", mush " + this.personnage;
        } else {
            return this.pseudo + " : " + this.pV + " PV, " + this.pA + " PA, " + this.pM + " PM, " + this.pMO + " PMO, contenu de l'inventaire " + Arrays.toString(this.inventaire) + ", humain " + this.personnage;
        }
    }

}