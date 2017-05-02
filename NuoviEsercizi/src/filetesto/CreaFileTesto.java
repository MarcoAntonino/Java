package filetesto;

import java.io.File;
import java.io.IOException;

public class CreaFileTesto {

	public static void main(String[] args) {
		//Se non esiste creo il file
		//lo crea nel package
		
		String path ="file.txt";
		
		File f = new File(path);
		
		if(f.exists())
			System.out.println("il file esiste");
		else
			try {
				if(f.createNewFile())
					System.out.println("Il file � stato creato");
				else
					System.out.println("Il file non � stato creato e non esiste");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//bisogna incapsularlo in eccezzione in quanto protrei creare il file dove 
		//non ho accesso o su un drive che non esiste

	}

}