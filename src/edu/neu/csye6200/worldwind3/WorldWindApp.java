/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.worldwind3;

import gov.nasa.worldwind.BasicModel;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import gov.nasa.worldwind.util.StatusBar;
import gov.nasa.worldwindx.examples.LayerPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Xiao
 */
public class WorldWindApp {

    private JFrame frame;
    private WorldWindowGLCanvas wwd = null;
    private StatusBar statusBar;
    private LayerPanel layerPanel;

    public WorldWindApp() {
        boolean hasStatusBar = true;
        boolean hasLayerPanel = true;
        frame = new JFrame();
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new BorderLayout());
        
        wwd =new WorldWindowGLCanvas();
        wwd.setPreferredSize(new Dimension(1000,800));
        wwd.setModel(new BasicModel());
        
        frame.getContentPane().add(wwd,BorderLayout.CENTER);
        
        if(hasStatusBar){
            statusBar = new StatusBar();
            frame.getContentPane().add(statusBar,BorderLayout.SOUTH);
            statusBar.setEventSource(wwd);
        }
        if(hasLayerPanel){
            layerPanel = new LayerPanel(wwd);
            frame.getContentPane().add(layerPanel,BorderLayout.WEST);
        }
        frame.pack(); //Recalculate sieze/Layout
    }
    public JFrame getFrame(){
        return frame;
    }
    public static void main(String[] args) {
        WorldWindApp wwApp = new WorldWindApp();
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                wwApp.getFrame().setVisible(true);
            }
        });
    }
}
