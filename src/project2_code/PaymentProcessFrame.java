/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package project2_code;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Ishanika
 */
public class PaymentProcessFrame extends javax.swing.JInternalFrame {
    
    PAYMENT payment = new PAYMENT();
    


    /**
     * Creates new form PaymentProcessFrame
     */
    public PaymentProcessFrame() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        bookrefnum = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        bankAccountNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameoncard = new javax.swing.JTextField();
        cvc_ = new javax.swing.JTextField();
        card_expiry = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jLabel11 = new javax.swing.JLabel();
        bookref = new java.awt.TextField();
        finalInvoice = new java.awt.TextArea();
        jLabel12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(528, 466));

        bookrefnum.setBackground(new java.awt.Color(249, 234, 225));
        bookrefnum.setPreferredSize(new java.awt.Dimension(600, 444));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Payment Process");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Bank Account Number:");

        jLabel3.setFont(new java.awt.Font("Georgia", 2, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(105, 105, 105));
        jLabel3.setText("must be 16 digits maximum");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textField1.setText("textField1");

        bankAccountNumber.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        bankAccountNumber.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Enter Name On Card:");

        nameoncard.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        nameoncard.setForeground(new java.awt.Color(0, 0, 0));

        cvc_.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        cvc_.setForeground(new java.awt.Color(0, 0, 0));

        card_expiry.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        card_expiry.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter CVC:");

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Enter Card Expiry:");

        jLabel7.setFont(new java.awt.Font("Georgia", 2, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(105, 105, 105));
        jLabel7.setText("must be 3 digits maximum");

        jLabel8.setFont(new java.awt.Font("Georgia", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Please press \"next\" to display Final Invoice");

        jButton1.setBackground(new java.awt.Color(170, 153, 143));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("next");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Georgia", 3, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Final Invoice:");

        jLabel10.setFont(new java.awt.Font("Georgia", 2, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Please press \"add details\" before pressing continue");

        jButton2.setBackground(new java.awt.Color(170, 153, 143));
        jButton2.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("add details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Georgia", 3, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Booking Reference Number");

        bookref.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        bookref.setEditable(false);

        finalInvoice.setFont(new java.awt.Font("Georgia", 0, 8)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Georgia", 2, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("(please note down this number)");

        javax.swing.GroupLayout bookrefnumLayout = new javax.swing.GroupLayout(bookrefnum);
        bookrefnum.setLayout(bookrefnumLayout);
        bookrefnumLayout.setHorizontalGroup(
            bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookrefnumLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(bookrefnumLayout.createSequentialGroup()
                        .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jButton1)
                            .addGroup(bookrefnumLayout.createSequentialGroup()
                                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(bankAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(nameoncard)
                                        .addComponent(cvc_)
                                        .addComponent(card_expiry)))
                                .addGap(10, 10, 10)))
                        .addGap(25, 25, 25)
                        .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(finalInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)
                                .addComponent(bookref, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        bookrefnumLayout.setVerticalGroup(
            bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookrefnumLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bookrefnumLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameoncard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(finalInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cvc_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookrefnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card_expiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookrefnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookrefnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        finalInvoice.setText("\n********Confirmation Email********" +
               "\nThis exact message will be sent via \nemail as a confirmation for \nbooking with Tempo Tickets" +
                "\nThank you for you booking \nwith Tempo Tickets" +
                "\nYour ticket booking reference \nnumber is below \n(needed for refunds etc)" +
                "\nWe look foward to seeing \nyou at your chosen event!");
        
            // Generate a random 8-digit number for booking reference number
        Random rand = new Random();
        int bookingrefnumber = rand.nextInt(10000000) + 10000000; // generates a random 8-digit number
        bookref.setText(String.valueOf(bookingrefnumber));
            
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String bank_acc_num = bankAccountNumber.getText();
        String name_on_card = nameoncard.getText();
        String cvc = cvc_.getText();
        String expiry = card_expiry.getText();
        String booking_ref_no = bookref.getText();

        if (bank_acc_num.trim().equals("") || name_on_card.trim().equals("") || bank_acc_num.trim().equals("") || cvc.trim().equals("") || expiry.trim().equals("") || booking_ref_no.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> bank acc num + full name + cvc + expiry + booking ref number", "Empty Fields", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Check if bank account number has 16 characters
            if (bank_acc_num.length() != 16) {
                JOptionPane.showMessageDialog(rootPane, "Bank account number must be 16 characters long. Please try again.", "Invalid Bank Account Number", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method
            }

            // Check if cvc has 3 characters
            if (cvc.length() != 3) {
                JOptionPane.showMessageDialog(rootPane, "CVC must be 3 characters long. Please try again.", "Invalid CVC", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method
            }

            if (payment.addPayment(bank_acc_num, name_on_card, cvc, expiry, booking_ref_no)) {
                JOptionPane.showMessageDialog(rootPane, "New Payment Added Successfully", "Add Payment", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Payment Successful", "Add Payment Error", JOptionPane.ERROR_MESSAGE);
            }

        }
     
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bankAccountNumber;
    private java.awt.TextField bookref;
    private java.awt.Panel bookrefnum;
    private javax.swing.JTextField card_expiry;
    private javax.swing.JTextField cvc_;
    private java.awt.TextArea finalInvoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField nameoncard;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
