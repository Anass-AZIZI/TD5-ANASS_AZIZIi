package partie2;
class EmailInvalideException extends Exception {}
class AgeInvalideException extends Exception {}

public class ex4 {
    static void inscrire(String email, int age) {
        try {
            if (!email.contains("@")) throw new EmailInvalideException();
            if (age < 18) throw new AgeInvalideException();
            System.out.println("Inscription OK");
        } catch (EmailInvalideException e) {
            System.out.println("email invalide");
        } catch (AgeInvalideException e) {
            System.out.println("age <18");
        }
    }

    public static void main(String[] args) {
        inscrire("ab", 16);  
    }
}