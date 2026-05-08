package partie3;


class Boite<T> {
    private T contenu;
    void setContenu(T c) { 
    	contenu = c; }
    T getContenu() { 
    	return contenu; }
}

public class ex1 {
    public static void main(String[] args) {
        Boite<String> sb = new Boite<>();
        sb.setContenu("C1");
        System.out.println(sb.getContenu());

        Boite<Integer> ib = new Boite<>();
        ib.setContenu(123);
        System.out.println(ib.getContenu());
    }
}
