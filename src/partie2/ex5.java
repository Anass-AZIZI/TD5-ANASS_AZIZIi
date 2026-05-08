package partie2;

class AuthentificationException extends Exception {}

public class ex5 {
    static void login(String u, String p) {
        try {
            if (!"admin".equals(u) || !"123".equals(p)) throw new AuthentificationException();
            System.out.println("Login OK");
        } catch (AuthentificationException e) {
            System.out.println("Identifiants incorrects");
        }
    }

    public static void main(String[] args) {
        login("x", "y");
    }
}
