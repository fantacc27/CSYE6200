/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java .io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xiao
 */
public class TestErrorHandling {
    
    public void run(){
        try {
            System.out.println("Before disaster hits");
            makeError(1);
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(TestErrorHandling.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("We had a regular Exception caught");
        }
    }
    
    public void makeError(int type) throws IOException, Exception, IllegalArgumentException{
        if(type == 1)
            throw new IOException("We had a disk error");
        if (type == 2)
            throw new IllegalArgumentException("We had an argument error");
        if (type == 3)
            throw new Exception("Sync failure");
    }
    
    public static void main(String[] args){
        TestErrorHandling teh = new TestErrorHandling();
        teh.run();
    }
    
}
