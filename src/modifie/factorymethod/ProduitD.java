package modifie.factorymethod;

public class ProduitD extends Produit {
    public ProduitD() {
    }

    @Override
    public void methodeproduit() {
        System.out.println("je suis un produit de type D");
        System.out.println("produitD.methodeproduit()");
    }
}
