/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaire;

/**
 *
 * @author Djafsia
 */
class technARisque extends Technicien implements ARisque {
    public technARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
    }
    public double calculerSalaire() {
    return super.calculerSalaire() + PRIME;
    } 

}
