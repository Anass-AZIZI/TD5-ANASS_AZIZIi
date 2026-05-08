package partie3;

import java.util.*;

public class ex11 {
    static void afficherListe(List<?> liste) {
        for (Object o : liste) System.out.print(o + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("A", "B", "C");
        List<Integer> li = Arrays.asList(1, 2, 3);
        afficherListe(ls);
        afficherListe(li);
    }
}
