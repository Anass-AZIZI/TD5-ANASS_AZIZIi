package partie1;

public class ex8 {
    static class calcul {
        static void verifierAge(int age) throws Exception {
            if (age < 18) {
                throw new Exception("age < 18");
            }
            System.out.println("age valide");
        }
    }
    public static void main(String[] args) {
        try {
            calcul.verifierAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}