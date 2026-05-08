package partie2;

class ChampObligatoireException extends Exception {}

public class ex8 {
    static void valider(String nom, String email) {
        try {
            if (nom == null || nom.isEmpty() || email == null || email.isEmpty())
                throw new ChampObligatoireException();
            System.out.println("Formulaire valide");
        } catch (ChampObligatoireException e) {
            System.out.println("Champ obligatoire manquant");
        }
    }

    public static void main(String[] args) {
        valider("", "a@b");
    }
}
