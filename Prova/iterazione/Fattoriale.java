//ERRATO!

package iterazione;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fattoriale {

	public static void main(String[] args) {
		// fattoriale di n
		/*
		 * n!=n*(n-1)*(n-2)*...*2*1
		 * Eccezioni:
		 * n==0 oppure n==1 allora n!=1
		 */
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		int n=0;
		boolean flag=false; //non ci sono errori
		do{
			flag=false;
			try{
				System.out.print("Inserisci un numero naturale: ");
				n = Integer.parseInt(tastiera.readLine());
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("\nErrore!");
				flag = true; //si è verificato un errore
				//System.exit(0);
				//qui termina il programma, in quanto se c'è un errore non va oltre
				/*
				 * Senza il sistem.exit la condizione va avanti
				 */
			}
			if(n<0)
				System.out.println("Solo numeri positivi");
				flag = true;
		}while(flag);
		/*
		 * Rispetto al while l'operazione nelle graffe, almeno una volta
		 * viene eseguita, anche se falsa. 
		 * Poi ovviamente lo esegue ogni volta che la condizione è vera 
		 */
		int fatt=1;
		for(int i=2;i<=n;i++)
			fatt *= i;
		
		System.out.println(n+"!="+fatt);

	}

}
