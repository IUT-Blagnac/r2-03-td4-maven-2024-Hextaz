public class Main {
    public static void main(String[] args) throws Exception {
        // Création d'une instance de la classe Pile avec une taille par défaut
        Pile p = new Pile();

        // Test de la méthode empiler
        p.empiler(4);
        p.empiler(6);

        // Test de la méthode est_Vide
        boolean estVide = p.est_Vide();
        System.out.println("La pile est vide : " + estVide);

        // Test de la méthode est_Plein
        boolean estPlein = p.est_Plein();
        System.out.println("La pile est pleine : " + estPlein);

        // Test de la méthode depiler
        int elementDepile = p.depiler();
        System.out.println("Élément dépilé : " + elementDepile);

        // Test de la méthode sommet
        int elementSommet = p.sommet();
        System.out.println("Sommet de la pile : " + elementSommet);

        // Test de la méthode vider
        p.vider();
        estVide = p.est_Vide();
        System.out.println("La pile est vide après vidage : " + estVide);
    }
}
