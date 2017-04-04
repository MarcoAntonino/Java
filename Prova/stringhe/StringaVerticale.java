package stringhe;

import java.util.Scanner;

public class StringaVerticale {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci una testo");
		String tmp = tastiera.nextLine();
		
		for(int i=0;i<tmp.length(); i++)
			System.out.println(tmp.charAt(i)); //meglio questa
		
		for(int i=0;i<tmp.length(); i++)
			System.out.println(tmp.substring(i,i+1)); // si usa per tirare fuori porzioni di stringhe
		
		
		
		
	}

}
