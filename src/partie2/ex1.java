package partie2;

class SoldeInsuffisantException extends Exception {

    public SoldeInsuffisantException(String msg) {
        super(msg);
    }
}

public class ex1 {
    static class CompteBancaire {
        String code;
        double solde;

        CompteBancaire(String code, double solde) {
            this.code = code;
            this.solde = solde;
        }
        void verser(double montant) {
            solde += montant;
            System.out.println(
                "nouveau solde : " + solde
            );
        }

        void retirer(double montant)
                throws SoldeInsuffisantException {

            if (montant > solde) {
                throw new SoldeInsuffisantException(
                    "solde insuffisant"
                );
            }

            solde -= montant;

            System.out.println(
                "nouveau solde : " + solde
            );
        }
    }

    public static void main(String[] args) {

        CompteBancaire c =
            new CompteBancaire("C1", 1590);

        try {

            c.retirer(2000);

        } catch (SoldeInsuffisantException e) {

            System.out.println(e.getMessage());
        }
    }
}