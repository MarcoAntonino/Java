package fileoggetto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeggiFileOggetto {

	public static void main(String[] args) {


		String nomeFile = "arraydiPersone.dat";
		ArrayList<Persona> list = null;
		Persona p = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(nomeFile);
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			if(obj instanceof ArrayList)
				list=(ArrayList<Persona>)obj;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		if(list!=null)
		{
			for(Persona d:list){
				System.out.println(d);
			}
		}
			

	}

}
