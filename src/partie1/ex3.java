package partie1;
public class ex3 {
	
	static class Tableau{
		
		static int AvecIf(int[] tab, int i) {
            if (i >= 0 && i < tab.length) {
                return tab[i];
            } else {
                System.out.println("erreur dindex hors limites");
                return -1;
            }
        }
		
		
		static int TryCatch(int[] tab, int i) {
			
			try { return tab[i]; }
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("exception : index invalide (try/catch)");
                return -1;
            }
        }
    }
				
				
	public static void main(String[] args) {
		
		
        int[] tab = {9, 4, 3, 1, 0};
        
        int indice = 6;
        
        System.out.println("Valeur = " + Tableau.AvecIf(tab, indice));
        System.out.println("Valeur = " + Tableau.TryCatch(tab, indice));

				
			}	
}
			
		
		
