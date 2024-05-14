/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_code;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Ishanika
 */
public class Panel extends JPanel  {

    private static final long serialVersionUID = 1L;
    private JFrame frame;

    //This is the constructor for Panel which sets up initial configuration. 
    public  Panel(JFrame frame) {
        this.frame = frame;
        this.setFocusable(true);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        MyFrame MyFrame = new MyFrame();
        MyFrame.draw(g);

    }

}
