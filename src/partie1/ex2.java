package partie1;

public class ex2 {

    static class calcul {

        static int LongueurSansEXC(String s) {
            if (s == null) {
                System.out.println("erreur : chaîne null");
                return 0;
            }
            return s.length();
        }

        static int LongueurAvecEXC(String s) {
            try {
                return s.length();
            } catch (NullPointerException e) {
                System.out.println("la chaîne est null");
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        String texte = null;

        System.out.println("Sans try/catch : " +
                calcul.LongueurSansEXC(texte));

        System.out.println("Avec try/catch : " +
                calcul.LongueurAvecEXC(texte));
    }
}