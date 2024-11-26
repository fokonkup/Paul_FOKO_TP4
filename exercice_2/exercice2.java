/*
 * Class de gestion des notes d'un etudiant 
 * avec les methodes d'affichage et calcul de moyenne
 */
public class GestionnaireNotes {

    /*
     * Affichage de la note de l'etudiant
     * @params : la methode prend le nom et le tableau de note en parametres
     * @return : pas de return cars on affiche juste les notes de l'etudiant
     */
    public void afficherNotes(String nom, int[] notes){
        System.out.println("Notes de " + nom + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /*
     * Calcul de la moyen de l'etudiant
     * @params: le tableau des notes de l'etudiant
     */
    public double moyenne(int[] notes){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        return (double) somme / notes.length;
    }

    /*
     * Affiche note et moyennes
     * @params : le nom de l'etudiant et le tableau de ses notes
     * @return void pas besoin de faire de reurn car la methods sert juste a afficher
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        afficherNotes(nomEtudiant, notes);
        
        // Affichage de la moyenne
        System.out.println("Moyenne : " + moyenne(notes));
    }
}
