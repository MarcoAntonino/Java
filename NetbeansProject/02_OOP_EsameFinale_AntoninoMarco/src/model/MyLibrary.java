/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Antonino Marco
 */
public class MyLibrary {
    
    public static String readTxt(){
        
        String nomeFile ="listaProdotti.csv";
        String testo = "";

        FileReader fr = null; 
        BufferedReader inputStream = null;

        try {
                fr = new FileReader(nomeFile);
                inputStream = new BufferedReader(fr);

                testo = inputStream.readLine();
                inputStream.close();
                fr.close();

        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
       

        return testo;
    }
    
    public static StringBuilder splittatore(String stringa){
        
        String[] righe = stringa.split("\n");
        StringBuilder elenco = new StringBuilder();
        
        for (String riga: righe){
            
            elenco.append(riga);
            
        }
        
        return elenco;
    }        
        
        
        
    
    
    
    
}
