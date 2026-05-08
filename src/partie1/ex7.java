package partie1;

public class ex7 {
    static class calcul {
        static void C() {
            throw new ArithmeticException("Erreur dans C");
        }
        static void B() {
            C();
        }
        static void A() {
            try {
                B();
            } catch (ArithmeticException e) {

                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        calcul.A();
    }
}
