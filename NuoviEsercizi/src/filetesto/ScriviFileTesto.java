package filetesto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriviFileTesto {

	public static void main(String[] args) {
		// Scrittura su file di testo
		/*
		 * Ogni volta che viene lanciato, sovrascrive
		 */
		
		String path = "file.txt";
		String testo = "Pino dei Palazzi � stato qui!";
		
		/*
		 * Per lavorare in una risorsa, bisogna decidere in che modalit� lavorarci
		 * 1. Lettura
		 * 2. Scrittura
		 * 3. Append(aggiungi in coda)
		 */
		
		
		// accesso alla risorsa
		FileWriter fw = null; //seleziona la risorsa
		BufferedWriter bw = null; //gestisce, scrive la risorsa
		
		try {
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			bw.write(testo); // lui scrive ma dobbiamo essere sicuri ma che tutto i lcotnenuto gestito, sia stato completato
			bw.flush();//finalizzatore operazione. � come se fosse il salva della situazione
			bw.close();//libera le risorse
			fw.close();
			
			System.out.println("Dati salvati con successo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //se non lo trova lo crea

	}

}
