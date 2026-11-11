package modifie.factorymethod;

public class Client {
    public static void main(String[] args) {
        System.out.println("........... Factory Method (exemple modifie : 4 produits) ...........");
        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;
        //affiche un produit de type A
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();
        //affiche un produit de type B
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();
        //affiche un produit de type C
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();
        //affiche un produit de type D
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeD);
        produit.methodeproduit();
        //produit inexistant : l'exception est maintenant interceptee
        try {
            produit = fabriqueproduit.createProduit("E");
            produit.methodeproduit();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage() + " (E)");
        }
    }
}
