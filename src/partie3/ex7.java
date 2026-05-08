package partie3;

public class ex7 {
    public static <T extends Number> double somme(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(somme(5, 3));      
        System.out.println(somme(2.5, 1.5)); 
    }
}
