package modifie.factory;

public class ProduitFactoryA extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitA();
        return produit;
    }
}
