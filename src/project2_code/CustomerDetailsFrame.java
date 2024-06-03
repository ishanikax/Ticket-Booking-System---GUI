/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package project2_code;

import com.sun.jdi.connect.spi.Connection;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.apache.derby.iapi.sql.PreparedStatement;

/**
 *
 * @author Ishanika
 */
public class CustomerDetailsFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CustomerDetailsFrame
     */
    
    //Creates a new instance of the USERS class, representing a new customer.
    USERS user = new USERS();
    
    public CustomerDetailsFrame() {
        initComponents();
        
        //Sets the border to empty.
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        //Gets the UI component for this frame.
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        //Remove the north pane from the frame.
        bi.setNorthPane(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        panel1.setBackground(new java.awt.Color(249, 234, 225));
        panel1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(600, 444));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Personal Details");

        jLabel2.setFont(new java.awt.Font("Georgia", 2, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Please enter the following details");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("First Name");

        firstName.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        firstName.setForeground(new java.awt.Color(0, 0, 0));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Last Name");

        lastName.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        lastName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Phone Number (must be 10 digits)");

        phoneNumber.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email Address");

        emailAddress.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        emailAddress.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(170, 153, 143));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("add details");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Please press \"add details\" before pressing continue");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jButton1)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(lastName)
                            .addComponent(emailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        
    }//GEN-LAST:event_firstNameActionPerformed

    //This method is for once the user selects add details and it is checking for anything missing before adding it to the database.
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        //Gets the text from the input fields.
        String fname = firstName.getText();
        String lname = lastName.getText();
        String email = emailAddress.getText();
        String phone = phoneNumber.getText();
        
        //Checks if any field is empty.
        if (fname.isEmpty() || lname.isEmpty() || email.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter details in all the boxes.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }
    
        //Checks if the phone number is valid (must be 10 digits).
        if (!phone.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number (exactly 10 digits, Must be integers).", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        //Checls if the email address is valid (contains an @ symbol).
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address (must contain '@' symbol).", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        //Checks if any field is empty after trimming white spaces.
        if(fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("")) {
        //Shows the  message if any field is empty after trimming.
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name + Phone Number", "Empty Fields", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Add user to the database.
            if (user.addUser(fname, lname, phone, email)) {
                //Success message if details is added successfully.
                JOptionPane.showMessageDialog(rootPane, "Details Added Successfully", "Add User", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Displays error message if details is not added successfully.
                JOptionPane.showMessageDialog(rootPane, "Details Added Successfully", "Add User Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_jButton1MousePressed
    //Getter methods for the first name and last name.
    //Returns the first name enetered by  the user.
    public String getFirstName() {
        return firstName.getText();
    }

    //Returns the last name entered by the user.
    public String getLastName() {
        return lastName.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastName;
    private java.awt.Panel panel1;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables
}
