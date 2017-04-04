package array;

public class ArrayInteri {

	public static void main(String[] args) {
		/*
		 * array o vettori 
		 * 
		 * dichiarazione di un array di interi
		 */
		int[] numeri = new int[5];
		/*
		 * Posso cambiare il tipo senza troppi problemi
		 */
		
		/*
		 * int numeri []; può andare bene ma NON usarlo
		 */
		
		//caricamento dei dati
		numeri[0]=7;
		numeri[1]=-7;
		numeri[2]=71;
		numeri[3]=-17;
		numeri[4]=78;
		
		//lettura
		//usiamo un ciclo for perchè è un'iterazione DEFINITA
		
		for(int i=0;i<5;i++)
			System.out.println("posizione: "+i+"; valore: "+numeri[i]);
	}

}
