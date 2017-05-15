package interfacceFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class myList extends ArrayList<Object> implements Icrud, Serializable{

	@Override
	public boolean write() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
