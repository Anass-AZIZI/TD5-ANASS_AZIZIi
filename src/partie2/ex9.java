package partie2;

class PaiementRefuseException extends Exception {}
class CarteExpireeException extends Exception {}

public class ex9 {
    static void payer(double montant, boolean expiree, double plafond) {
        try {
            if (expiree) throw new CarteExpireeException();
            if (montant > plafond) throw new PaiementRefuseException();
            System.out.println("Paiement accepté");
        } catch (CarteExpireeException e) {
            System.out.println("Carte expirée");
        } catch (PaiementRefuseException e) {
            System.out.println("Montant dépasse le plafond");
        }
    }

    public static void main(String[] args) {
        payer(1200, false, 1000);
    }
}
