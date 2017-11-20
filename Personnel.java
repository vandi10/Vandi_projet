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
class Personnel {
    private employe[] staff;
    private int nbreemploye;
    private final static int MAXEMPLOYE = 200;
    public Personnel() { 
    staff = new employe [MAXEMPLOYE];
    nbreemploye = 0;
    } 
    public void ajouteremploye(employe e){ 
    ++nbreemploye;
    if (nbreemploye <= MAXEMPLOYE){
    staff[nbreemploye - 1] = e;
    }else {System.out.println("pas plus de + MAXEMPLOYE" + " employe"); 
    } 
    } 
    public double salairMoyen(){
    double somme = 0.0;
    for (int i = 0; i < nbreemploye; i++) {
    somme += staff[i].calculerSalaire();
    } 
    return somme / nbreemploye;
    } 
    public void afficherSalaire(){
    for (int i = 0; i < nbreemploye; i++) {
    System.out.println(staff[i].getNom() + "gagne"
            + staff[i] .calculerSalaire()+ "francs.");
    } } 
}
