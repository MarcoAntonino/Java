package sequenza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CasualeInfSup {

	public static void main(String[] args) {
		// generatore di un numero casuale
		/*
		 * In un intervall odi valori noti
		 * Scegliamo due parametri
		 */
		
		//solo numeri positivi
		int inf =0;
		int sup = 0;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		
		boolean flag=false; //non ci sono errori
		do{
			flag=false;
			try{
				System.out.print("Inserisci estremo inferiore: ");
				inf = Integer.parseInt(tastiera.readLine());
				
				System.out.print("Inserisci estremo superiore: ");
				sup = Integer.parseInt(tastiera.readLine());
			}catch(Exception e){
				
				System.out.println("\nErrore!");
				flag = true; //si è verificato un errore
				
			}
			
		}while(flag);
		//casuale intero [1-10]
		
		double c1=Math.random(); //tira fuori numeri casuali da 0.0 a 0.9
		double c2=c1*sup;
		double c3=c2+inf;
		int c4 = (int)c3;//casting o meglio troncamento di dato
		
		System.out.println("valore c1: "+c1);
		System.out.println("valore c2: "+c2);
		System.out.println("valore c3: "+c3);
		System.out.println("valore c4: "+c4);


	}

}
