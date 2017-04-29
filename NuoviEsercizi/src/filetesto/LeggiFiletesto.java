package filetesto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFiletesto {

	public static void main(String[] args) {
		// Lettura da file di testo
		
		String nomeFile ="file.txt";
		String testo = "";
		
		FileReader fr = null; //se il file non esiste, NON lo crea. Perchè è un reader
		BufferedReader inputStream = null;
		
		try {
			fr = new FileReader(nomeFile);
			inputStream = new BufferedReader(fr);
			
			testo = inputStream.readLine();
			inputStream.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 2 excpetion:
		 * 1. No ntrova il file
		 * 2. I lreadline potrebbe avere un'eccezione
		 */
		
		System.out.println(testo);

	}

}
