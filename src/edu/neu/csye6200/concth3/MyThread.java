/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.concth3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xiao
 */
public class MyThread extends Thread{
    
    private boolean done = false;
    
    private int ctr = 0;
    
    public MyThread(){
        
    }
    public MyThread(String name){
        super(name);
        
    }
    
    public void run(){
        while(!done){
            try {
                sleep(2L);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            doWork();//Waste some computer time
            ctr++;
            if((ctr % 10 )==0){
            System.out.println("Thread : " + this.getName() + " - loop #" + ctr);
        }
        }
    }
    private void doWork(){
        for (int i = 0; i < 100000; i++){
            double val = Math.exp((double) i);
            val = Math.sin(val);
        }
    }
}
