/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NewMarco
 */
public interface ICrud {
    
    public void createDat(String newFileName);
    
    public void createTxt(String newFileName);
    
    public Object readDat(String fileName);
    
    public void addDat(String currentFileName);
    
    public void search(Object object);
    
    
}
