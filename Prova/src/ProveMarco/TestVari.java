package ProveMarco;

import java.util.Scanner;

public class TestVari {

	public static void main(String[] args) {
		String msg="Ciao ";
		String nome;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Scrivi il tuo nome");
		nome=tastiera.nextLine();
		
		msg+=nome;
		
		System.out.println(msg);
		
		/*
		 * Modi per dichiarare un array:
		 * int[] numeri = new int [5];
		 * e poi lo carichi
		 * int [] numeri = {3,5,6};
		 */

	}

}
