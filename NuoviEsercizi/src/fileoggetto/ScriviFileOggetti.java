package fileoggetto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ScriviFileOggetti  {

	public static void main(String[] args) {
		// lavoriamo con gli oggetti
		
		String nomeFile = "dati.dat";
		
		Persona p = new Persona();
		p.setNome("Gino");
		p.setCognome("Dellillo");
		p.setDataNascita(new GregorianCalendar(1993,4,25));
		p.setLuogoNascita("Moncalieri");
		p.setSex(Sesso.MASCHIO);
		
		//accesso alla risorsa
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(nomeFile);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			oos.flush();
			oos.close();
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
