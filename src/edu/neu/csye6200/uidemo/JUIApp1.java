/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.uidemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import net.java.dev.designgridlayout.DesignGridLayout;

/**
 *
 * @author Xiao
 */
public class JUIApp1 implements ActionListener {

    private JFrame Frame = null;
    private JPanel mainPanel = null;
    private JButton but0 = null;
    private JButton but1 = null;
    private JLabel genCtnLabel = new JLabel("GenCount:");
    private JTextField stepCntTF = null;
    private JComboBox<String> ruleCBox = null;
    private MyCanvas canvas = null;
    private JTextField idTF = null;

    public JUIApp1() {
        initGUI();
        System.out.println("Construction done");
    }

    private void initGUI() {
        Frame = new JFrame();
        Frame.setTitle("JUIApp1");
        Frame.setSize(new Dimension(400, 300));
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLayout(new BorderLayout());
        Frame.add(getMainPanel(), BorderLayout.NORTH);
        canvas = new MyCanvas();
        Frame.add(canvas,BorderLayout.CENTER);
        Frame.setVisible(true);
    }

    public JPanel getMainPanel() {
        JPanel panel = new JPanel();
        DesignGridLayout pLayout = new DesignGridLayout(panel);
        idTF = new JTextField();
        //panel.setLayout(new FlowLayout());
        but0 = new JButton("Start");
        but0.addActionListener(this);
        but1 = new JButton("Stop");
        //but1.setEnabled(false);
        but1.addActionListener(this);
        //panel.add(but0);
        //panel.add(but1);
        //panel.add(genCtnLabel);
        stepCntTF = new JTextField();
        //panel.add(stepCntTF);
        
        //ruleCBox = new JComboBox<String>();
        //ruleCBox.addItem("Rule 1");
        //ruleCBox.addItem("Rule 2");
        //panel.add(ruleCBox);
        //panel.setBackground(Color.RED);
        
        pLayout.row().grid(new JLabel("StepCnt: ")).add(stepCntTF);
        pLayout.row().grid(new JLabel("ID: ")).add(idTF);
        pLayout.emptyRow();
        pLayout.row().center().add(but0,but1);
        return panel;
    }

    public static void main(String[] args) {
        JUIApp1 app = new JUIApp1();
        System.out.println("Program has completed!!!!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("We received and ActionEvent " + e);
        if(e.getActionCommand().equalsIgnoreCase("Start"));
        System.out.println("We pressed Start");
    }

}
