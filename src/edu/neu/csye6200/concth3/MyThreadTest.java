/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.concth3;

/**
 *
 * @author Xiao
 */
public class MyThreadTest {
    private MyThread[] threads = new MyThread[10];
    private MyThread threadA = null;
    private MyThread threadB = null;
    
    public MyThreadTest(){
        threadA = new MyThread("A");//build a thread
        threadB = new MyThread("B");
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        for(int i = 0; i < threads.length; i++){
            threads[i] = new MyThread("Thread " + i);
            threads[i].setPriority(Thread.NORM_PRIORITY);
        }
        threadA.start();// start the thread
        threadB.start();
        for (int i = 0; i < threads.length; i++){
            threads[i].start();
        }
    }
    public static void main(String[] args){
        MyThreadTest mtt = new MyThreadTest();
        System.out.println("Main is done...");
    }
}
