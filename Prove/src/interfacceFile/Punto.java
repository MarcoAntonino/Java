package interfacceFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Punto implements Icrud{
	
	private int x;
	private int y;
	
	
	
	@Override
	public boolean write() {
		FileOutputStream fos;
        ObjectOutputStream oos;
        
       
        try {
        	 fos = new FileOutputStream("C:pippo.dat");
             oos = new ObjectOutputStream(fos);
             
             oos.writeObject(this);            
             oos.flush();
			fos.close();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
        
        
		return true;
	}
	@Override
	public Object read() {
		
		return null;
	}
	
	
	

}
