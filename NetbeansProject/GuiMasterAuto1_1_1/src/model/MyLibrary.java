/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
    
    
    public static void create(String newFileName, ArrayList<Auto> newArrayList){
        
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
    
    public static void createTxt(String newFileName, Auto newAuto){
                
        String testo = newAuto.toString();
        
        FileWriter fw = null; //seleziona la risorsa
        BufferedWriter bw = null; //gestisce, scrive la risorsa
        try {
            fw = new FileWriter(newFileName);
            bw = new BufferedWriter(fw);
            bw.write(testo);
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MyLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
    public static void aggiungiTxt(String currentFileName, Auto currentAuto){
        
        ArrayList<Auto> list = read(currentFileName);
    }
       
    
    
    public static ArrayList<Auto> read(String fileName) {
		
		ArrayList<Auto> list = new ArrayList<Auto>();
		
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
     * @param currentAuto
     */
    public static void aggiungi(String currentFileName, Auto currentAuto){
        
        ArrayList<Auto> list = read(currentFileName);
        list.add(currentAuto);
        create(currentFileName, list);        
    }
    
    public static Auto searchForPosition(int index, String currentFileName){
        
        ArrayList<Auto> list = read(currentFileName);
        Auto personOfInterest;
        personOfInterest = list.get(index);
        
        return personOfInterest;        
    }
    
    public static int searchForIstance(ArrayList<Auto> currentList, Auto personOfInterest){
        
        int index = -1;
        
        try{
            index = currentList.indexOf(personOfInterest);
	}catch(Exception e){
            e.printStackTrace();
        }
                
        return index;
    }
}
