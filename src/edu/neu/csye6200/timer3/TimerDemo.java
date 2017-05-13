/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.timer3;

import java.util.Timer;

/**
 *
 * @author Xiao
 */
public class TimerDemo {

    private Timer timer;

    public TimerDemo() {
        System.out.println("Starting TimerDemo");
        timer = new Timer();
        //timer.schedule(new RemindTask(), 1000L);
        timer.schedule(new RemindTask(), 5000L, 1000L);
        
    }

    public static void main(String[] args) {
        new TimerDemo();
        System.out.println("We're done!");
    }

}
