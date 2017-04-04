package iterazione;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CasualiNInfSup {

	public static void main(String[] args) {
		// generatore di un numero casuale
		/*
		 * In un intervallo di valori noti
		 * Scegliamo due parametri
		 */
		
		//solo numeri positivi
		int inf =0;
		int sup = 0;
		int n=0;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		
		boolean flag=false; //non ci sono errori
		do{
			flag=false;
			try{
				
				
				System.out.print("Quanti valori devo generare? ");
				n = Integer.parseInt(tastiera.readLine());
				
				System.out.print("Inserisci estremo ifneriore: ");
				inf = Integer.parseInt(tastiera.readLine());
				
				System.out.print("Inserisci estremo superiore: ");
				sup = Integer.parseInt(tastiera.readLine());
			}catch(Exception e){
				
				System.out.println("\nErrore!");
				flag = true; //si è verificato un errore
				
			}
			
		}while(flag);
		
		//casuale intero [inf-sup]
		/*
		 * versione proposta da: De Gennaro Marco (non funziona)
		 * (non funziona)
		 *  c = (int)(Math.random()*(sup*2)+inf);
		 * 
		 * versione proposta da Danilo (funziona)
		 *  c = (int)((Math.random()*sup+(Math.random()*inf));
		 *  
		 *  versione proposta da Colangelo Davide (funziona)
		 *  c = (int)(Math.random()*(sup*2)+inf);
		 *  if (inf < 0) c=((int)(Math.random()*10) >4) ? c : c*-1
		 *  
		 *  (int)(Math.random()*(sup-inf+1)+inf);(non funziona)
		 */
		
		int c=0;
		
		for(int i=0;i<n;i++){
			 c = (int)(Math.random()*(sup-inf+1)+inf); //generatore di numeri casuali che non funziona
			 System.out.println("valore generato: "+c);
		}
		
		
		


	}

}
