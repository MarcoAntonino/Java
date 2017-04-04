package stringhe;

import java.util.Random;
import java.util.Scanner;

public class GeneraPasswordCasuale {

	public static void main(String[] args) {
		
		// generatore di psw casuale
		
		String number = "0123456789";
		String letter="abcdefghijklmnopqrstuvwxyz";
		String special="$&@#+-!_";
		String pattern=letter+letter.toUpperCase()+number+special;
		
		System.out.println(pattern);
		
		Scanner tastiera = new Scanner (System.in);
		
		System.out.println("Lunghezza delle psw: ");
		int n = tastiera.nextInt();
		tastiera.close(); // serve a finalizzare la tastiera 

		
		String pw="";
		for(int i=0;i<n;i++)
		{
			Random r = new Random();
			pw += pattern.charAt(r.nextInt(pattern.length()));
		}
		
		System.out.println("psw generata: "+pw);
	}

}
