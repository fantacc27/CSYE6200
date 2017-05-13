/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class switchdefaulttest {
    public static void main(String[] args){
        int choice = 6;
        int val = 7;
        switch(choice){
            case 7: val = 2;
            default: 
            
            case 4: val = 3; break;
        }
        System.out.println("val: " + val);
    }
    
}
