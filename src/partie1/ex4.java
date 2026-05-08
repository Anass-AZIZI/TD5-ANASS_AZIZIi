package partie1;

public class ex4 {

    static class calcul {
        static int convertir(String s) {
            try {
                return Integer.parseInt(s);

            } catch (NumberFormatException e) {

                System.out.println("la conversion est impossible");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        String S = "test";
        System.out.println(
            calcul.convertir(S)
        );
    }
}