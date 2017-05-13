/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class StrExample {
        
        String localStr = "";
        
        //Constructor
        public StrExample(){
            System.out.println("Constructor called");
 
            String quote = "The universe is full of stars";
            int len = quote.length();
            int starIndex = quote.indexOf("star");
            System.out.println(starIndex);
            
            if (quote.equalsIgnoreCase("Mars"))
                System.out.println("we have a planet");
        }
        
        public String toString() {
            return "[StrExample is a great class]";
        }
        public static void main(String[] args) {
            StrExample strEX = new StrExample();
            System.out.println("strEx: " + strEX);
                    
            
        }
}
