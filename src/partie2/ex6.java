package partie2;

class StockInsufficientException extends Exception {}

public class ex6 {
    static class Produit {
        int stock = 5;
        void retirer(int q) {
            try {
                if (q > stock) throw new StockInsufficientException();
                stock -= q;
                System.out.println("Nouveau stock: " + stock);
            } catch (StockInsufficientException e) {
                System.out.println("Stock insuffisant");
            }
        }
    }

    public static void main(String[] args) {
        new Produit().retirer(10);
    }
}