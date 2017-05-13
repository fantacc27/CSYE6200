/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Inner;

/**
 *
 * @author Xiao
 */
public class InnerTest {
    
    private int key = 20;
    public class InnerProc {
        public String encode(String input){
            StringBuffer sb = new StringBuffer();
            
            for(char c : input.toCharArray()){
                char c2 = (char)(c ^ key);
                sb.append(c2);
            }
            return sb.toString();
        }
    }
    
    public InnerTest(){
        InnerProc iproc = new InnerProc();
        String str0 = "My secret message 123";
        System.out.println("Str0: " + str0);
        String str1 = iproc.encode(str0);
        System.out.println("Str1: " + str1);
    }
    public static void main(String[] args){
        InnerTest inTest = new InnerTest();
    }
}
