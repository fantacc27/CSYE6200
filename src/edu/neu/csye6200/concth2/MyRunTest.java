/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.concth2;

/**
 *
 * @author Xiao
 */
public class MyRunTest {

    private MyRunnable myRunA = null;
    private Thread threadA = null;

    private MyRunnable myRunB = null;
    private Thread threadB = null;
    
    private MyRunnable[] runnables = new MyRunnable[10];
    private Thread[] threads = new Thread[10];
    public MyRunTest() {
        myRunA = new MyRunnable("A");
        threadA = new Thread(myRunA);

        threadA.start();
        myRunB = new MyRunnable("B");
        threadB = new Thread(myRunB);

        threadB.start();
        for (int i =0; i < threads.length; i++){
            runnables[i] = new MyRunnable("run " + i);
            threads[i] = new Thread(runnables[i]);
            threads[i].start();
        }
    }

    public static void main(String[] args) {
        MyRunTest mrt = new MyRunTest();
        System.out.println("Main is done!!!!");

    }
}
