/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xiao
 */
public class FileWriterTest {
    
    public void run(){
        String base = "src/Week5/";
        
        try {
            FileReader reader = new FileReader(base + "FileWriterTest.java");
            FileWriter writer = new FileWriter(base + "FWDuplicate.txt");
            
            int inVal = reader.read();
            while (inVal >= 0) {
                writer.write(" " + (char) inVal);
                inVal = reader.read();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(FileWriterTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args){
        FileWriterTest fwt = new FileWriterTest();
        fwt.run();
    }
    
}
