/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antoninom
 */
public class MyLibrary {
    
    /*
    Libreria di utility
    */
    
    public abstract void checkFormat();;
    
    public static void create(String newName, String newSecondName, 
            GregorianCalendar newBirthDate, String newBirthCity, enumeration.Sesso newSex){
        String fileName = "anagrafica.dat";
        
        
        Persona p = new Persona();
		p.setNome("Pino");
		p.setCognome("Dellillo");
		p.setDataNascita(new GregorianCalendar(1993,4,25));
		p.setLuogoNascita("Moncalieri");
		p.setSex(Sesso.MASCHIO);
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(lista.add(p));            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyLibrary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public static ArrayList<Persona> leggi() {
		
		String path = "anagrafica.dat";
		ArrayList<Persona> lista = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			if(obj instanceof Persona)
				lista=(ArrayList)obj; 
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
                    if(fis!=null){
                        fis=null;
                    }
                    if(ois!=null){
                        ois=null;
                    }
                }
	    
                return lista;
		

	}
    
}
