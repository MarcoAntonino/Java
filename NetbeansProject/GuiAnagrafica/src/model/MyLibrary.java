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
import javax.swing.JOptionPane;

/**
 *
 * @author antoninom
 */
public class MyLibrary {
    
    /*
    Libreria di utility
    */
    
    
    public static void create(String newFileName, ArrayList<Persona> newArrayList){
        
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            fos = new FileOutputStream(newFileName);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(newArrayList);            
            oos.flush();
            fos.close();
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyLibrary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static ArrayList<Persona> read(String fileName) {
		
		ArrayList<Persona> list = new ArrayList<Persona>();
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			if(obj instanceof ArrayList)
				list=(ArrayList)obj; 
			
						
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
	    
                return list;
		

    }
    
    /**
     *
     * @param currentFileName
     * @param currentPersona
     */
    public static void aggiungi(String currentFileName, Persona currentPersona){
        
        ArrayList<Persona> list = read(currentFileName);
        list.add(currentPersona);
        create(currentFileName, list);  
    }
    
    public static Persona searchForPosition(int index, String currentFileName){
        
        ArrayList<Persona> list = read(currentFileName);
        Persona personOfInterest;
        personOfInterest = list.get(index);
        
        return personOfInterest;        
    }
    
    public static int searchForIstance(String currentFileName, 
            ArrayList<Persona> currentList, Persona personOfInterest){
        
        int index = -1;
        
        try{
            index = currentList.indexOf(personOfInterest);
	}catch(Exception e){
            e.printStackTrace();
        }
                
        return index;
    }
    
    public static Persona searchForName(String currentFileName, String name){
        
        ArrayList<Persona> list = read(currentFileName);
        Persona personOfInterest = null;
        
        for(Persona p:list)
        {
            if(name==p.getCognome() || name ==p.getNome())
                personOfInterest=p;
                        
        }
        
        return personOfInterest;
        
    }
    
    public static Persona searchForIndex(String currentFileName, int index){
        
         ArrayList<Persona> list = read(currentFileName);
         return list.get(index);
        
    }
    
    
}
