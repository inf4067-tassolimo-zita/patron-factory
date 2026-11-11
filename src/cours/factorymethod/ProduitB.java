package cours.factorymethod;

public class ProduitB extends Produit {
    public ProduitB() {
    }

    @Override
    public void methodeproduit() {
        System.out.println("je suis un produit de type B");
        System.out.println("produitB.methodeproduit()");
    }
}
