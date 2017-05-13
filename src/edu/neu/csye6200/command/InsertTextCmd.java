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
public class InsertTextCmd extends Command{
    private String data;
    public InsertTextCmd(CmdTest document, String inputText){
        super(document);
        data = inputText;
    }
    @Override
    public void execute() {
        cmdTest.getDoc().append(data);
        
    }
    
}
