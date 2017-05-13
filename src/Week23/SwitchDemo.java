
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class SwitchDemo {
    public static void main(String[] args) throws IOException{
        char inChar = ' ';
        System.out.println("Enter choice (a,b,c) or \'q\' to quit, then press <enter>");
        do {
            inChar = (char) System.in.read();
            //System.out.println(" inChar: " + inChar + " > " + (int) inChar);
            
            switch(inChar) {
                case 'a':
                    System.out.println("You selected option a");
                    break;
                case 'b':
                    System.out.println("You selected option b");
                    break;
                case 'c':
                    System.out.println("You selected option c");
                    break;
                case 'q':
                case '\n': //newline
                case '\r': //return
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
        while(inChar != 'q');
    }
    
}
