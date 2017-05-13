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
public abstract class Command {
    protected CmdTest cmdTest = null;
    public Command(CmdTest cmdTest){
        this.cmdTest = cmdTest;
    }
    abstract public void execute();
    
}
