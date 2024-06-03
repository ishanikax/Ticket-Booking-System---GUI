/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package project2_code;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Ishanika
 */
public class BookingFrame extends javax.swing.JInternalFrame {
    //This class repplaces the desktop pane used in homepage when users select the 'Make a Booking Tab'.
    //The follwing method initialises BookingFrame Object, setting up it's UI components and layout.
    //Adds a new Customer Details Frame to it's desktop pane. 
    //Also removes any existing components from the desktop pane and sets the border of the frame to empty. 

    /**
     * Creates new form BookingFrame
     */
    public BookingFrame() {
        //This intialises components
        initComponents();
        
        //Set border to empty
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        
        //Get the UI components
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        
        //Set the north pane to null
        bi.setNorthPane(null);
        
        //Removing all components from jDesktopPane2
        jDesktopPane2.removeAll();
        
        //Creates a new CustomerDetailsFrame and adds it to jDesktopPane2
        CustomerDetailsFrame mb= new CustomerDetailsFrame();
        jDesktopPane2.add(mb).setVisible(true);
           
        
    }


    
    /*The method below displays all of the interface things*/
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 730));

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(125, 79, 80));
        jLabel1.setText("Booking");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BOOK NOW!");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter your details below and follow the payment process to secure your spot at your desired event!");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_code/logobook.png"))); // NOI18N

        jDesktopPane2.setPreferredSize(new java.awt.Dimension(600, 451));
        jDesktopPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDesktopPane2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(170, 153, 143));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("continue");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(97, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(447, 447, 447)
                                .addComponent(jButton1))
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(70, 70, 70)))
                .addComponent(jButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDesktopPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane2MousePressed
        
        
    }//GEN-LAST:event_jDesktopPane2MousePressed
    
    //This tracks whether the TicketCalculationFrame is currently visible or not.
    private boolean isTicketCalculationFrameShown = false;
    
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        //Removes all components from jDesktopPane2.
        jDesktopPane2.removeAll();
   
        //Checks if the TicketCalculationFrame is not shown.
        if (!isTicketCalculationFrameShown) {
            //Creates a new TicketCalculationFrame an add it to jDesktopPane2.
            TicketCalculationFrame tcf = new TicketCalculationFrame();
            jDesktopPane2.add(tcf).setVisible(true);
            //Sets the flag to indicate that TicketCalculationFrame is now shown.
            isTicketCalculationFrameShown = true; 
        } else {
            //Creates a new PaymentProcessFrame and add it to jDesktopPane2.
            PaymentProcessFrame ppf = new PaymentProcessFrame();
            jDesktopPane2.add(ppf).setVisible(true);
            
            //Sets the flag to indicate that TicketCalculationFrame is no longer visible.
            isTicketCalculationFrameShown = false; 
    }

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
