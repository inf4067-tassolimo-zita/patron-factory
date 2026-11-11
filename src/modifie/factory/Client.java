package modifie.factory;

public class Client {
    public static void main(String[] args) {
        System.out.println("........... Factory (exemple modifie : 4 produits) ...........");
        ProduitFactory produitfactoryA = new ProduitFactoryA();
        ProduitFactory produitfactoryB = new ProduitFactoryB();
        ProduitFactory produitfactoryC = new ProduitFactoryC();
        ProduitFactory produitfactoryD = new ProduitFactoryD();
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
        //affiche un produit de type D
        produit = produitfactoryD.getProduit();
        produit.methodeproduit();
        //le type de fabrique peut aussi etre choisi a l'execution (argument du programme)
        String choix = args.length > 0 ? args[0] : "D";
        ProduitFactory fabrique;
        switch (choix) {
            case "A": fabrique = produitfactoryA; break;
            case "B": fabrique = produitfactoryB; break;
            case "C": fabrique = produitfactoryC; break;
            default:  fabrique = produitfactoryD; break;
        }
        System.out.println("-- fabrique choisie a l'execution : " + fabrique.getClass().getSimpleName());
        fabrique.getProduit().methodeproduit();
    }
}
