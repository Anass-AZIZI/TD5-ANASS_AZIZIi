package partie2;

class MontantInvalideException extends Exception {
    public MontantInvalideException(String msg) {
        super(msg);
    }
}

public class ex2 {
    static void verifierMontant(double montant) throws MontantInvalideException {
        if (montant <= 0) {
            throw new MontantInvalideException("montant invalide (≤ 0)");
        }
        System.out.println("Montant valide : " + montant);
    }

    public static void main(String[] args) {
        try {
            verifierMontant(-50);
        } catch (MontantInvalideException e) {
            System.out.println(e.getMessage());
        }
    }
}
