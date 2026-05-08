package partie3;

interface Comparateur<T> {
    int comparer(T a, T b);
}

class ComparateurInteger implements Comparateur<Integer> {
    public int comparer(Integer a, Integer b) { return a - b; }
}

class ComparateurString implements Comparateur<String> {
    public int comparer(String a, String b) { return a.length() - b.length(); }
}

public class ex4 {
    public static void main(String[] args) {
        ComparateurInteger ci = new ComparateurInteger();
        System.out.println(ci.comparer(10, 5));
        ComparateurString cs = new ComparateurString();
        System.out.println(cs.comparer("abc", "ab"));
    }
}
