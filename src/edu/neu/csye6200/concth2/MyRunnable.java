/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.concth2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xiao
 */
public class MyRunnable implements Runnable {
    
    private String name = "";
    private boolean done = false;
    private int ctr = 0;
    private int val = 0;
    
    public MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {
        while(!done){
          
            int total = func(50);
            ctr++;
            System.out.println("Thread: " + name + " - loop # " + ctr + "total: " + total);
        }
    }
    
    private int func(int n){
        val = 1;
        for(int i = 1; i < n; i++){
            val += i;
        }
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        for (int i = 1; i < n; i ++){
            val += i;
        }
        return val;
    }
    
}
