package classi;

public class TestQuadrato {

	public static void main(String[] args) {
		/*
		 * Solo perchè io ho dichiarato il quadrato dall'altra partye io posso fare:
		 */
		/*
		 * Quadrato q = new Quadrato();
		 * non è più valido in quanto abbiamo sovrascritto il costruttore
		 */
		
		Quadrato q = new Quadrato(12.72);
		/*
		 * Ho creato una variabile di tipo quadrato. 
		 * In memoria ho un'istanza, è la copia di questa classe che ho creato.
		 */
		
		
		
		//mi restituisce 0 ovviamente
		//System.out.println("lato: "+q.lato);
		//System.out.println("Perimetro: "+q.perimetro());
		//System.out.println("Area: "+q.area());
		//System.out.println("Diagonale: "+q.diagonale());
		System.out.println("Dati del quadrato: \n"+q.stampa());
		/*
		 * Stessa cosa di prima ma qui si scrive una sola riga
		 */
		System.out.println();

	}

}
