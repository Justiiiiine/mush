/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_mush;

import java.util.ArrayList;

/**
 *
 * @author elina
 */
public class JournalDeBord {
    private int joueur_piece; //nombre de joueur par pièce
    private int incendie; //nombre d'incendies qui sont en cours
    private ArrayList <String> ObjetEndommage = new ArrayList<>(); //Liste des objets endommagés
    private int vaisseau_alien;//nombre de vaisseaux aliens autour de notre vaiseau
    private int nb_mush;//nombre de mush à bord
    private int nb_mort;//nombre de joueur morts depuis le début de la partie
    private int etat_vaisseau[] = new int [3];//état du vaisseau au niveau de : l'armure,l'oxygène et le fuel
    private String position_objet;//Position des objets dans les unités de stockage 
    private ArrayList <String> neron_terminer = new ArrayList<>();//Liste des recherches laboratoire terminées
    private ArrayList <String> laboratoire_terminer = new ArrayList<>();//Liste des projets Neron terminés
}
