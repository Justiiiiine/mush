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
public class Competence {
    private CompetenceListe type;

    public Competence(CompetenceListe type) {
        this.type = type;
    }

    public CompetenceListe getType() {
        return this.type;
    }

    public String toString() {
        return this.type + "";
    }
}
