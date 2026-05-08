package partie2;

class QuotaDepasseException extends Exception {}

public class ex7 {
    static void telecharger(double taille) {
        try {
            if (taille > 100) throw new QuotaDepasseException();
            System.out.println("téléchargement OK");
        } catch (QuotaDepasseException e) {
            System.out.println("quota dépassé");
        }
    }

    public static void main(String[] args) {
        telecharger(150);
    }
}