package fileoggetto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ScriviFileOggetti {
	
	public static void main(String[] args) {
		
		String nomeFile  ="arraydiPersone.dat";
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		Persona p = new Persona();
		p.setNome("Pino");
		p.setCognome("Dellillo");
		p.setDataNascita(new GregorianCalendar(1993,4,25));
		p.setLuogoNascita("Moncalieri");
		p.setSex(Sesso.MASCHIO);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		lista.add(p);
		
		try {
			fos = new FileOutputStream(nomeFile);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(lista);
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
