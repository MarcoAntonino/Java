/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antoninom
 */
public class Ascensore implements Runnable{
    
    private int minPiano;
    private int maxPiano;
    private int currentPiano;
    private int selectedPiano;
    
    

    
    public Ascensore(int minPiano, int maxPiano) {
        this.minPiano = minPiano;
        this.maxPiano = maxPiano;
        this.currentPiano = 0;
        this.selectedPiano = 0;
        Thread t = new Thread(this);
        t.start();
    }
    
    

    public int getMinPiano() {
        return minPiano;
    }

    public void setMinPiano(int minPiano) {
        this.minPiano = minPiano;
    }

    public int getMaxPiano() {
        return maxPiano;
    }

    public void setMaxPiano(int maxPiano) {
        this.maxPiano = maxPiano;
    }

    public int getCurrentPiano() {
        return currentPiano;
    }

    public void setCurrentPiano(int currentPiano) {
        this.currentPiano = currentPiano;
    }

    public int getSelectedPiano() {
        return selectedPiano;
    }

    public void setSelectedPiano(int selectedPiano) {
        this.selectedPiano = selectedPiano;
    }
    
    

    @Override
    public String toString() {
        return "Ascensore{" + "minPiano=" + minPiano + ", maxPiano=" + maxPiano + ", currentPiano=" + currentPiano + '}';
    }

    @Override
    public void run() {
        
        while(currentPiano!=selectedPiano)
        {
            muovi();
        }
    }
   


 public void muovi() {
        try {
            int movimento = selectedPiano-currentPiano;
            currentPiano=(movimento>0) ? currentPiano+1: currentPiano-1;
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ascensore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}