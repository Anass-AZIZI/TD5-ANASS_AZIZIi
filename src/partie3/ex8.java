package partie3;

class Animal<T> {
    T nom;
    Animal(T n) { nom = n; }
    void afficher() { System.out.println(nom); }
}

class Chien extends Animal<String> {
    Chien(String n) { super(n); }
}

public class ex8 {
    public static void main(String[] args) {
        Chien c = new Chien("RIOO");
        c.afficher();
    }
}