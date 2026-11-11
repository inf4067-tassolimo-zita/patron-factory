package cours.factorymethod;

public class FabriqueProduit {
    public static final String typeA = "A";
    public static final String typeB = "B";
    public static final String typeC = "C";

    /** Methode fabrique : le type du produit n'est connu qu'a l'execution. */
    public Produit createProduit(String type) {
        Produit produit = null;
        switch (type) {
            case typeA:
                produit = new ProduitA();
                break;
            case typeB:
                produit = new ProduitB();
                break;
            case typeC:
                produit = new ProduitC();
                break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
        return produit;
    }
}
