/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.uidemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Xiao
 */
public class MyCanvas extends JPanel {

    public MyCanvas() {

    }

    public void paint(Graphics g) {
        drawCanvas(g);
    }

    public void drawCanvas(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        Dimension size = getSize();

        g2d.setColor(Color.BLACK);

        g2d.fillRect(0, 0, size.width, size.height);

        g2d.setColor(Color.red);
        g2d.drawString("Hello World 20", 10, 20);

        g2d.setColor(Color.YELLOW);
        g2d.drawLine(0, 0, size.width, size.height);

        int cellSize = 20;
        int maxRows = size.height / (cellSize);
        for (int j = 0; j < maxRows; j++) {

            for (int i = 0; i <= 20; i++) {
                Color col = new Color(50 + i * 10, 255 - j * 10, 50);
                paintCell(g2d, i * (cellSize + 2), j * (cellSize + 2), cellSize, col);
            }
        }
    }

    private void paintCell(Graphics2D g2d, int x, int y, int size, Color color) {
        g2d.setColor(color);
        g2d.fillRect(x, y, size, size);
    }
}
