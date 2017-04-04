package selezione;

public class Saluto {

	public static void main(String[] args) {
		/*
		 * Saluto
		 * Buongiorno 6-14
		 * Buon pomeriggio 14-18
		 * Buona sera 18-22
		 * Buona notte 22-6
		 * Le ore vanno da 0 a 23
		 * 
		 */
		
		int h=13;
		
		String msg="";
		if(h<0 || h>23)
			msg = "Errore";
		else if (h>=6 && h<14)
			msg = "Buongiorno";
		else if (h>=14 && h<18)
			msg = "Buon pomeriggio";
		else if (h>=18 && h<22)
			msg = "Buona sera";
		else
			msg = "Buona notte";
		
		System.out.println(msg);
		/*
		 * Non annegare quest istruzione nel nostro codice
		 */
		
	}

}
