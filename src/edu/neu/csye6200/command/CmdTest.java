/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.command;

/**
 *
 * @author Xiao
 */
public class CmdTest {
    private StringBuffer textDoc = new StringBuffer();
    
    public CmdTest(){
        textDoc.append("Beginning ");
        InsertTextCmd itc = new InsertTextCmd(this, "ABC123");
        System.out.println("Before TextDoc: " + textDoc.toString());
        itc.execute();
        System.out.println("After TextDoc: " + textDoc.toString());
    }
    public void add(String data){
        
    }
    public StringBuffer getDoc(){
        return textDoc;
    }
    public static void main(String[] args){
        CmdTest cmdTest = new CmdTest();
    }
}
