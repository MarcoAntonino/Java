package selezione;

public class NomeSettimana {

	public static void main(String[] args) {
		/*
		 * Dato in input un numero itnero,
		 * stampare il nome del giorno della settimana
		 */
		
		int num = 2;
		
		String msg = "";
		
		if (num<1 || num>7)
			msg = "Errore";
		else if (num==1)
			msg = "Luned�";
		else if (num==2)
			msg = "Marted�";
		else if (num==3)
			msg = "Mercoled�";
		else if (num==4)
			msg = "Gioved�";	
		else if (num==5)
			msg = "Venerd�";
		else if (num==6)
			msg = "Sabato";
		else if (num==7)
			msg = "Domenica";	
		
		System.out.println(msg);
	}
	
	
	
}
