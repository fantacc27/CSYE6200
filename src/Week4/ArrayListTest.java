/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.ArrayList;

/**
 *
 * @author Xiao
 */
 
public class ArrayListTest {
    ArrayList<Dog> dogList;
    public ArrayListTest(){
        dogList = new ArrayList<Dog>();
        
        Dog d0 = new Dog("Sam", 3.5);
        Dog d1 = new Dog("Bullet", 25.0);
        Dog d2 = new Dog("Turtle", 1.0);
        
        dogList.add(d0);
        dogList.add(d1);
        dogList.add(d2);
        
        for (Dog dg : dogList){
            System.out.println("Dog: " + dg);
        }
    }
    
    public static void main(String args[]){
        ArrayListTest alTest = new ArrayListTest();
        
        
    }
    
}
