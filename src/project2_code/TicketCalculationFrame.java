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
public class TicketCalculationFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form TicketCalculationFrame
     */
    TICKETS tickets = new TICKETS();


    int ticketCost = 0;

    private double finalPrice;

    double theTerrysPrice = 50.85;
    double dylanPrice = 44.99;
    double soulBossaDuoPrice = 20.00;
    double pinkPeppersPrice = 12.00;

    public TicketCalculationFrame() {
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
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

        inputNumberOfTickets = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        events = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ticketype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numOfTickets = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        ticketPriceDisplay = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        totalCostDisplay = new java.awt.TextField();

        setPreferredSize(new java.awt.Dimension(540, 480));

        inputNumberOfTickets.setBackground(new java.awt.Color(249, 234, 225));
        inputNumberOfTickets.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        inputNumberOfTickets.setPreferredSize(new java.awt.Dimension(600, 444));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Choose An Event");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Choose your event to make a booking");

        events.setBackground(new java.awt.Color(170, 153, 143));
        events.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        events.setForeground(new java.awt.Color(0, 0, 0));
        events.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "The Terrys", "Soul Bossa Duo", "Dylan", "Pink Peppers" }));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Select Ticket Type");

        ticketype.setBackground(new java.awt.Color(170, 153, 143));
        ticketype.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        ticketype.setForeground(new java.awt.Color(0, 0, 0));
        ticketype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard Ticket", "Special Ticket (Wheelchair Access)", "" }));

        jLabel4.setFont(new java.awt.Font("Georgia", 2, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Click the button below to display individual ticket price");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter Number of Tickets");

        numOfTickets.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        numOfTickets.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total Cost Display");

        jToggleButton1.setBackground(new java.awt.Color(170, 153, 143));
        jToggleButton1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("next");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Please press \"next\" to display Total Cost");

        jLabel8.setFont(new java.awt.Font("Georgia", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Please press \"add details\" before pressing continue");

        jButton1.setBackground(new java.awt.Color(170, 153, 143));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("add details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(170, 153, 143));
        jButton2.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ticket Price");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        textField1.setText("textField1");

        ticketPriceDisplay.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        ticketPriceDisplay.setEditable(false);

        textField2.setText("textField2");

        totalCostDisplay.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        totalCostDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostDisplayActionPerformed(evt);
            }
        });
        totalCostDisplay.setEditable(false);

        javax.swing.GroupLayout inputNumberOfTicketsLayout = new javax.swing.GroupLayout(inputNumberOfTickets);
        inputNumberOfTickets.setLayout(inputNumberOfTicketsLayout);
        inputNumberOfTicketsLayout.setHorizontalGroup(
            inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputNumberOfTicketsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(events, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numOfTickets, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ticketype, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ticketPriceDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43)
                .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalCostDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        inputNumberOfTicketsLayout.setVerticalGroup(
            inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputNumberOfTicketsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputNumberOfTicketsLayout.createSequentialGroup()
                        .addComponent(events, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ticketype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalCostDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(inputNumberOfTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ticketPriceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numOfTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputNumberOfTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputNumberOfTickets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed

        String selectedEvent = (String) events.getSelectedItem();
        String selectedTicketType = (String) ticketype.getSelectedItem();

        double price = 0.0;

        if (selectedTicketType.equals("Standard Ticket")) {
            switch (selectedEvent) {
                case "The Terrys":
                    price = theTerrysPrice;
                    break;
                case "Soul Bossa Duo":
                    price = soulBossaDuoPrice;
                    break;
                case "Dylan":
                    price = dylanPrice;
                    break;
                case "Pink Peppers":
                    price = pinkPeppersPrice;
                    break;
            }
        } else if (selectedTicketType.equals("Special Ticket (Wheelchair Access)")) {
            switch (selectedEvent) {
                case "The Terrys":
                    price = theTerrysPrice + 10.0;
                    break;
                case "Soul Bossa Duo":
                    price = soulBossaDuoPrice + 10.0;
                    break;
                case "Dylan":
                    price = dylanPrice + 10.0;
                    break;
                case "Pink Peppers":
                    price = pinkPeppersPrice + 10.0;
                    break;
            }
        }

        ticketPriceDisplay.setText("Individual Ticket Price: $" + price);

        finalPrice = price;


    }//GEN-LAST:event_jButton2MousePressed

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MousePressed
        int numOfTicketsField = Integer.parseInt(numOfTickets.getText());
        double totalCost = finalPrice * numOfTicketsField;
        totalCostDisplay.setText("Total Cost: $" + totalCost);

    }//GEN-LAST:event_jToggleButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String event = (String) events.getSelectedItem();
        String ticket_type = (String) ticketype.getSelectedItem();
        String price = ticketPriceDisplay.getText();
        String ticket_amount = numOfTickets.getText();
        String total_cost = totalCostDisplay.getText();

        if (event.isEmpty() || ticket_type.isEmpty() || ticket_amount.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter s value in all the boxes.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (event.trim().equals("") || ticket_type.trim().equals("") || ticket_amount.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> Event + Ticket Type + Number of Tickets", "Empty Fields", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (tickets.addTickets(ticket_type, price, ticket_amount, total_cost, event)) {
                JOptionPane.showMessageDialog(rootPane, "Ticket Selection Successful", "Add Ticket", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ticket Added Successfully", "Add Ticket Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalCostDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCostDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCostDisplayActionPerformed

    //Need to implment representation of variables as well as calculations for cost and total cost depending on the event selected 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> events;
    private java.awt.Panel inputNumberOfTickets;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField numOfTickets;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField ticketPriceDisplay;
    private javax.swing.JComboBox<String> ticketype;
    private java.awt.TextField totalCostDisplay;
    // End of variables declaration//GEN-END:variables

}
