package partie3;

public class ex6 {
    public static <T> void afficherTableau(T[] tableau) {
        for (T e : tableau) System.out.print(e + " ");
        System.out.println();
    }

    public static <T> T getPremier(T[] tableau) {
        return tableau[0];
    }

    public static void main(String[] args) {
        String[] mots = {"un", "deux", "trois"};
        afficherTableau(mots);
        System.out.println("Premier: " + getPremier(mots));
    }
}}
