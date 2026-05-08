package partie3;

class Vehicle<T> {
    T vitesse;
    Vehicle(T v) { vitesse = v; }
    void afficher() { System.out.println(vitesse); }
}

class Voiture<T> extends Vehicle<T> {
    Voiture(T v) { super(v); }
}

public class ex9 {
    public static void main(String[] args) {
        Voiture<Integer> v = new Voiture<>(120);
        v.afficher();
    }
}