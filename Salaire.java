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
class Salaire {
    public static void main (String[]  args) {
    Personnel P = new Personnel();
    P.ajouteremploye(new Vendeur("piere", "business", 45, "1995", 30000));
    P.ajouteremploye(new Representant("leon", "vendtout",
    25, "2001", 20000));
    P.ajouteremploye(new Technicien("yves", "Bosseur", 28, "1998", 1000));
    P.ajouteremploye(new Manutentionnaire("jeanne", "Stocketout", 32, "1998", 45));
    P.ajouteremploye(new technARisque("Jean", "Flippe", 28, "2000", 1000));
    P.ajouteremploye(new technARisque("Ali", "Abordage", 30, "2001", 45));
    
    P.afficherSalaire();
    System.out.println("Le salaire moyen dans l'entreprise est de " 
    + P.salairMoyen() + " francs.");
    }

    
}
