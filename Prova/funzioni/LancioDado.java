package funzioni;

public class LancioDado {
	
	/*
	 * Il metodo non ha bisogno di essere istanziato e quindi non verr� istanziato
	 * Restituisce un valore intero ed � visto unico
	 */
	
	//metodo statico
	public static int lancioDado(){
		return lancioDado(6); 
	}
	/*
	 * uso il metodo generico e che richiamo in questo caso necessario
	 * PARAMETRIZZANDOLO
	 * In modo da annullare le ridondanze
	 */
	
	//generalizzazione
	
	/*
	 * variamo la firma del metodo(identificatore del metodo+numero di parametri)
	 * Overloading
	 * 
	 * 
	 */
	
	public static int lancioDado(int noFaccie){
		return (int)(Math.random()*noFaccie+1);
	}
	
	public static void main(String[] args) {
		/*
		 * lancio del dado a 6 facce
		 */
		
		int dado = 0;
		int dado17 = 0;
		int dadoN=0;
		int n=10;
		for (int i=0;i<n;i++){
			dado = lancioDado(); // � in corsivo per indicare che � un metodo
			dado17 = lancioDado(17);
			dadoN = lancioDado(54);
			System.out.println("Valore estratto: "+dado);
			System.out.println("Valore estratto(17): "+dado17);
			System.out.println("Valore estratto(54): "+dadoN);
		}
		//servono 6 contatori, ogni volta che esce la faccia, conta 1

	}

}
