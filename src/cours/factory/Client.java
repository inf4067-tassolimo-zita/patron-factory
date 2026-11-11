package cours.factory;

public class Client {
    public static void main(String[] args) {
        System.out.println("........... Factory (exemple du cours : 3 produits) ...........");
        ProduitFactory produitfactoryA = new ProduitFactoryA();
        ProduitFactory produitfactoryB = new ProduitFactoryB();
        ProduitFactory produitfactoryC = new ProduitFactoryC();
        Produit produit = null;
        //affiche un produit de type A
        produit = produitfactoryA.getProduit();
        produit.methodeproduit();
        //affiche un produit de type B
        produit = produitfactoryB.getProduit();
        produit.methodeproduit();
        //affiche un produit de type C
        produit = produitfactoryC.getProduit();
        produit.methodeproduit();
    }
}
