package proveMarco;

import java.util.Scanner;

public class TestVari {

	public static void main(String[] args) {
		String msg="Ciao ";
		int nome = 0;
		boolean flag = true;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Scrivi il tuo nome");
		
		do{
			flag = true;
			
			try{
				nome=tastiera.nextInt();
			}
			catch(Exception e){
				flag = false;
			}
		}while(!flag);
		tastiera.close();
		
		//msg+=nome.;
		
		System.out.println(nome);
		
		/*
		 * Modi per dichiarare un array:
		 * int[] numeri = new int [5];
		 * e poi lo carichi
		 * int [] numeri = {3,5,6};
		 */
		
//		Persona marco = new Persona();
//		
//		Scanner tastiera = new Scanner(System.in);
//		System.out.println("Inserisci il nome della persona");
//		String nome=tastiera.nextLine();
//		marco.setNome(nome);
//		System.out.println("Inserisci il cognome della persona");
//		String cognome=tastiera.nextLine();
//		marco.setCognome(cognome);
//			
//		System.out.println(marco);

	}

}
