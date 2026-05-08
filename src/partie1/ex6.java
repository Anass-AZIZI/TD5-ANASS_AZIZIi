package partie1;

public class ex6 {
    static class Machine {
        boolean etat = false;
        void demarrer() {
            if (etat) {
                throw new IllegalStateException(
                    "Machine deja demarre"
                );
            }
            etat = true;
            System.out.println("la machine a demarree");
        }
    }

    public static void main(String[] args) {

        Machine m = new Machine();

        try {

            m.demarrer();
            m.demarrer();

        } catch (IllegalStateException e) {

            System.out.println(e.getMessage());
        }
    }
}