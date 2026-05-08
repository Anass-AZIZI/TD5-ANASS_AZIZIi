package partie3;

class Paire<T, U> {
    T premier;
    U second;
    Paire(T p, U s) { 
    	premier = p; second = s; 
    	}
    void afficherPaire() { System.out.println(premier + " - " + second); }
}

public class ex2 {
    public static void main(String[] args) {
        Paire<String, Integer> p = new Paire<>("Age", 20);
        p.afficherPaire();
    }
}