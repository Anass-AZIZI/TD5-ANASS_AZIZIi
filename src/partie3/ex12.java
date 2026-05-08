package partie3;

import java.util.*;

public class ex12 {
    static void afficherNombres(List<? extends Number> liste) {
        for (Number n : liste) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<Double> ld = Arrays.asList(1.1, 2.2, 3.3);
        afficherNombres(li);
        afficherNombres(ld);
    }
}
