/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.obs3;

import java.util.Observable;

/**
 *
 * @author Xiao
 */
public class EventPublisher extends Observable {
    private int ctr = 0;
    private boolean done = false;
    public EventPublisher() {
        System.out.println("EventPublisher - we are here");
    }

    public void doAction() {
        setChanged();
        notifyObservers( new String("A message") + ctr++);
    }
    
    public void run(){
        while(!done){
            doAction();
            if(ctr>10){
                done = true;
            }
        }
    }

    public static void main(String[] args) {
        EventPublisher ep = new EventPublisher();
        EventSubscriber es1 = new EventSubscriber();
        ep.addObserver(es1);
        
        ep.run();
    }

}
