package partie2;

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String msg) { super(msg); }
}

class MontantInvalideException extends Exception {
    public MontantInvalideException(String msg) { super(msg); }
}

public class ex3 {
    static class CompteBancaire {
        double solde;
        CompteBancaire(double solde) { this.solde = solde; }

        void retirer(double montant) throws MontantInvalideException, SoldeInsuffisantException {
            if (montant <= 0) {
                throw new MontantInvalideException("Montant ≤ 0 impossible");
            }
            if (montant > solde) {
                throw new SoldeInsuffisantException("solde insuffisant");
            }
            solde -= montant;
            System.out.println("Nouveau solde : " + solde);
        }
    }

    public static void main(String[] args) {
        CompteBancaire c = new CompteBancaire(500);
        try {
            c.retirer(600);
        } catch (MontantInvalideException e) {
            System.out.println(e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }
    }
}