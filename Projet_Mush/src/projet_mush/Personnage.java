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
public class Personnage {
     private String nom;
    private Competence competence1;
    private Competence competence2;
    private int clefSecu;

    public Personnage(String n, Competence c1, Competence c2, int cSecu) {
        this.nom = n;
        this.competence1 = c1;
        this.competence2 = c2;
        this.clefSecu = cSecu;
    }

    public String getNom() {
        return this.nom;
    }

    public Competence getCompetence1() {
        return this.competence1;
    }

    public Competence getCompetence2() {
        return this.competence2;
    }

    public String toString() {
        return this.nom + " : compÃ©tence de " + this.competence1 + " et de " + competence2;
    }

    
}
