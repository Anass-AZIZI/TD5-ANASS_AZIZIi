
package partie3;
interface Calcul<T> {
    T addition(T a, T b);
}

class CalculInteger implements Calcul<Integer> {
    public Integer addition(Integer a, Integer b) { return a + b; }
}

class CalculDouble implements Calcul<Double> {
    public Double addition(Double a, Double b) { return a + b; }
}

public class ex3 {
    public static void main(String[] args) {
        CalculInteger ci = new CalculInteger();
        System.out.println(ci.addition(5, 3));
        CalculDouble cd = new CalculDouble();
        System.out.println(cd.addition(2.5, 1.5));
    }
}
