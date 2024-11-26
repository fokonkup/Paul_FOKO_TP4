/*
 * classe de gestion de facture avec les methodes de calcul de remise
 */
public class FactureManager {
    /*
     * calcul de la reduction selon la categorie
     * @return du montant avec la reduction appliquer
     */
    public double getReductuion(String typeProduit, double mount){
        if (typeProduit.equals("Alimentaire")) {
            mount -= mount * 0.05; // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            mount -= mount * 0.1; // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            mount -= mount * 0.15; // Réduction de 15%
        }

        return mount;
    }
    
    /*
     * Calcul le total d'une facture
     * @return de montant de la facture total
     */    
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        total = getReductuion(typeProduit, total);
        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }
}
