package filetesto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ScritturaStreamDati {

	public static void main(String[] args) {
		
		String nomeFile = "file.txt";
		String testo = "Pino dei Palazzi e tutti sono pazzi!";
		
		//accesso alla risorsa
		FileOutputStream fos = null; 
		PrintWriter pw = null;
		/*
		 *Questa classe gestisce flussi di dati molto più grandi rispetto alle altre
		 *quindi useremo questa
		 *
		 */
		
		try {
			fos = new FileOutputStream(nomeFile);
			pw = new PrintWriter(fos);
			
			pw.write(testo);
			pw.flush();
			pw.close();
			fos.close();
			
			System.out.println("Dati salvati con successo!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
