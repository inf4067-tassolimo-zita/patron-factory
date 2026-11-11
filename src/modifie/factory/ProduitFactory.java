package modifie.factory;

/** Fabrique abstraite : getProduit() invoque la methode fabrique createProduit(). */
public abstract class ProduitFactory {
    public Produit getProduit() {
        return createProduit();
    }

    protected abstract Produit createProduit();
}
