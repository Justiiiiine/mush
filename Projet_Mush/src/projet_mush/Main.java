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
public class Main {
     public static void main(String[] args) {
        Competence c1 = new Competence(CompetenceListe.BOURREAU);
        Competence c2 = new Competence(CompetenceListe.LEADER);
        Personnage p = new Personnage("Mechante reine", c1, c2, 1);
        boolean m = false;
        Joueur j = new Joueur("Lea", p, m);
        System.out.println(j);
      
     }
} 

