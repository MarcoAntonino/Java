/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author antoninom
 */
public class Ascensore implements Runnable{
    
    private int minFloor;
    private int maxFloor;
    private int currentFloor;
    private int selectedFloor;
    private JTextField output;
    
    

    
    public Ascensore(int minPiano, int maxPiano) {
        this.minFloor = minPiano;
        this.maxFloor = maxPiano;
        this.currentFloor = 0;
        this.selectedFloor = 0;
        Thread t = new Thread(this);
        t.start();
        
    }

    public Ascensore(int minFloor, int maxFloor, JTextField output) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.output = output;
        Thread t = new Thread(this);
        t.start();
        this.currentFloor = 0;
        this.selectedFloor = 0;
    }
    
    public Ascensore(int minFloor, int maxFloor, int currentFloor, JTextField output) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.output = output;
        Thread t = new Thread(this);
        t.start();
        this.currentFloor = 0;
        this.selectedFloor = 0;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public void setMinFloor(int minFloor) {
        this.minFloor = minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getSelectedFloor() {
        return selectedFloor;
    }

    public void setSelectedFloor(int selectedFloor) {
        this.selectedFloor = selectedFloor;
    }

    public JTextField getOutput() {
        return output;
    }

    public void setOutput(JTextField output) {
        this.output = output;
    }
    
     

    @Override
    public String toString() {
        return "Ascensore{" + "minPiano=" + minFloor + ", maxPiano=" + maxFloor + ", currentPiano=" + currentFloor + '}';
    }

    @Override
    public void run() {
        
        if (this.getCurrentFloor()!=this.getSelectedFloor()){
                
                    int direction = currentFloor-selectedFloor;
                    if(direction<0)//si sale
                    {
                        for(currentFloor= currentFloor;currentFloor<=selectedFloor;currentFloor++)
                        {
                            output.setText(String.valueOf(getCurrentFloor()));
                            try {    

                                    Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Ascensore.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            
                        }
                    }else{//si scende
                        for(currentFloor= currentFloor;currentFloor>=selectedFloor;currentFloor--)
                        {
                            output.setText(String.valueOf(getCurrentFloor()));
                            try {    

                                    Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                Logger.getLogger(Ascensore.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        }
                    }
                    
                    this.setCurrentFloor(this.getSelectedFloor());
            
    }
   


  }
}