/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.obs3;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Xiao
 */
public class EventSubscriber implements Observer{
    public EventSubscriber(){
        
    }
/*    public init(EventPublisher ep){
        ep.addObserver(this);
    }*/
    @Override
    public void update(Observable o, Object arg) {
        // react to update
        System.out.println("EventSubscriber received update from "+ o);
        System.out.println("                              message" + arg);
    }
    
    
}
