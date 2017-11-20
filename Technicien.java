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
 class Technicien extends employe {
     private final static double FACTEUR_UNITE = 5.0;
     private int unites;
     public Technicien(String prenom, String nom, int age, String date, int unites) {
     super(prenom, nom,age, date);
     this.unites = unites;
     }
     public double calculerSalire() {
     return FACTEUR_UNITE * unites;
     }
     public double calculerSalaire(){
     return FACTEUR_UNITE * unites;
     }
     public String getTitre()
     {
         return "Le technicien";
     }
    
}
