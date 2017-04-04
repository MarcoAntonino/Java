package stringhe;

import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner (System.in);
		
		
		System.out.println("Testo: ");
		String testo = tastiera.nextLine();

		testo=(""+testo.charAt(0)).toUpperCase()+testo.substring(1).toLowerCase();
		
		System.out.println("Capitalize: "+testo);
	}

}
