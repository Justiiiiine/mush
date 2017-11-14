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
public class Vaisseau {
    private int point_armure;
    private int unite_oxygene;
    private int unite_de_fuel;
    private JournalDeBord jdb;
    private Plan plan;
    
    public Vaisseau(journal_de_bord jdb,plan plan){
        this.point_armure=200;
        this.unite_oxygene=500;
        this.unite_de_fuel=50;
        this.jdb=jdb;
        this.plan=plan;            
    }
    public int getPoint_armure(){
        return this.point_armure;
    }
    public int setPA(int x){
        this.point_armure=x;
    }
    public int getUnite_oxygene(){
        return this.unite_oxygene;
    }
    public int setUnite_oxygene(int x){
        this.unite_oxygene=x;
    }
    public int getUnite_de_fuel(){
        return this.unite_de_fuel;
    }
    public int setUnite_de_fuel(int x){
        this.unite_de_fuel=x;
    }
    public JournalDeBord getJDB(){
        return this.jdb;
    }
    public JournalDeBord setJDB(JournalDeBord jdb){
        this.jdb=jdb;
    public Plan getPlan(){
        return this.plan;
    }
    public Plan setPlan(Plan plan){
        this.plan=plan;
    }
}
