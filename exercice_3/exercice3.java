/*
 * Class de gestion de stock
 */
public class StockManager {

    /*
     * Ajouter un produit en stock
     * @param produit : le nom du produit
     * @param quantite : la quantite a ajouter au stock
     * @param stock : la valeur du stock initial
     */
    public void ajoutStock(String produit, int quantite, int stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

     /*
     * Retrait de produit en stock
     * @param produit : le nom du produit
     * @param quantite : la quantite a retirer du stock
     * @param stock : la valeur du stock initial
     */
    public void retraitStock(String produit, int quantite, int stock){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }

    /*
     * gerer le stock 
     * @param typeOperation specifie l'operation a faire ("ajout" ou "retrait")
     * @param produit le nom du produit sur lequel l'operation s'effectue
     * @param quantite la quantite a ajoute ou retirer
     * @param stock la quantite en stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            ajoutStock(produit, quantite, stock);
        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {
            retraitStock(produit, quantite, stock);
        // Si l'action est inconnu
        } else {
            System.out.println("Opération inconnue.");
        }
    }
}
