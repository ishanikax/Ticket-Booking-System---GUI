/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ishanika
 */
public class MyFrame extends JFrame {
    
    //Fix this so that it can adjust to the users screen size
    
    
    
    MyFrame() {
        
        this.setTitle("Tempo Tickets");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //this will prevent the frame from being resized
        this.setVisible(true);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        this.setSize(screenWidth, screenHeight);
        
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setBackground(Color.WHITE);
        this.add(centerPanel, BorderLayout.NORTH);
               
        JLabel label = new JLabel();
        label.setText("--------------------•*¨*•.•*¨*.•*¨*•*¨*•.•*¨*.•*¨*  Tempo Tickets   •*¨*•.•*¨*.•*¨*.•*¨*•.•*¨*.•*¨*--------------------");
        label.setForeground(new Color(125, 79, 80));
        Font font = new Font("Garamond", Font.PLAIN, 24);
        label.setFont(font);
 
        centerPanel.add(label);
        
        JLabel label2 = new JLabel();
        label2.setFont(new java.awt.Font("Garamond", Font.PLAIN, 18)); 
        label2.setText("Welcome to Tempo Tickets! This is an interface which you can use to purchase tickets for events held at The Tuning Fork and Powerstation. ");
        label2.setBounds(10,20,80,25);
        

        JLabel label3 = new JLabel();
        label3.setFont(new java.awt.Font("Garamond", Font.PLAIN, 14)); 
        label3.setText("Choose from our menu below by entering a number!");
        

     
        ImageIcon logoicon = new ImageIcon("TempoTicketsLogoIcon.png");//this sets the image icon to the tempo tickets logo which I have designed
        this.setIconImage(logoicon.getImage());

        this.getContentPane().setBackground(Color.white); // this changes the colour of the background

    }

    void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
