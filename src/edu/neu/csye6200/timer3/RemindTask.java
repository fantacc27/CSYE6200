/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.timer3;

import java.awt.Toolkit;
import java.util.TimerTask;

/**
 *
 * @author Xiao
 */
public class RemindTask extends TimerTask{
    
    private int cnt = 0;
    
    @Override
    public void run() {
        System.out.println ("Timer alert " + cnt++);
        Toolkit.getDefaultToolkit().beep();
        if(cnt >= 5){
            this.cancel();
        }
    }
    
}
