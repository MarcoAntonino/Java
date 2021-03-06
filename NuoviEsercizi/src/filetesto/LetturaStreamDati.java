package filetesto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LetturaStreamDati {

	public static void main(String[] args) {
		
		String path = "file.txt";
		//String testo = null; cos� non � inizializzata la stringa vuota
		String testo = "";
		
		FileInputStream fis = null;
		Scanner sc = null;
		
		/*
		 * Scanner � pi� performante e trasforma da sola gli int
		 */
		
		/*
		 * Il meccanismo del try chat serve per evitare le seguenti condizioni:
		 * Riga 1. 
		 * Riga 2. Pino dei palazzi ecc..
		 * 
		 * oppure 
		 * 
		 * Riga 1. Pin odei palazzi ecc...
		 * Riga 2.
		 */
		
		try {
			fis = new FileInputStream(path);
			sc = new Scanner(fis);
			while(sc.hasNextLine())//se trovi altre righe
				testo += (testo.length() >0 ? "\n": "")+sc.nextLine(); //l'operatore ternario serve per dire se la lunghezza del testo, vai capo. La seconda condizione si verifica solo la prima volta. Se ci sono 10 righe, la prima condizione viene fatta 9 volte. Per leggere l'intera linea, con .next la singola parola
			sc.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(testo);

	}

}
