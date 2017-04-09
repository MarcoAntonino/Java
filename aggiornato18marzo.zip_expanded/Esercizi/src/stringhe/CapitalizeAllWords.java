package stringhe;

import java.util.Scanner;

public class CapitalizeAllWords {

	public static String capitalize(String testo){
		
		return (""+testo.charAt(0)).toUpperCase()+testo.substring(1).toLowerCase();

	}
	
	public static void main(String[] args) {
		
		
		
		Scanner tastiera = new Scanner (System.in);
		
		
		System.out.println("Testo: ");
		String testo = tastiera.nextLine();
		tastiera.close();

		String[] parole = testo.split(" ");
		for(int i = 0; i<parole.length;i++)
			parole[i]=capitalize(parole[i]);
			
		
		//Consente di tirare fuori da una stringa un'array di stringhe utilizzando
		//un separatore
		
		String join = String.join(" ", parole);
		
		System.out.println("Capitalize: "+join);
	}

}
