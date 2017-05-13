/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.scope;

/**
 *
 * @author Xiao
 */
public class ScopeTest {
    private int abc = 10;
    public static int staVal = 5;
    
    public ScopeTest(){
        
    }
    
    public void test(){
        int i = 0;
        if(true){
            int j = 5;
            System.out.println("j is " + j);
        }
        {
            int k = 10;
            System.out.println("k is " + k);
        }
        System.out.println("test is done");
    }
    
    public static void main(String[] args){
        ScopeTest scope = new ScopeTest();
        scope.test();
    }
    
}
