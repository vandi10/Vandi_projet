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
abstract class employe {
    private String nom;
    private String prenom;
    private int age;
    private String date;
    public employe(String prenom, String nom, int age, String date) { 
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
       }
    public abstract double calculerSalaire();
    public String getTitre()
    {
    return "L'employe" ;
    }
public String getNom() {
return getTitre() + " " + nom;
}
    
}
