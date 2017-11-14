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
public class Objet {
       private ObjetListe nomObjet;

    public Objet(ObjetListe nomObjet) {
        this.nomObjet = nomObjet;
    }


    public ObjetListe getNomObjet() {
        return this.nomObjet;
    }

    public String toString() {
        return this.nomObjet + "";
    }
}
