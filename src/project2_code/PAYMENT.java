/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_code;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ishanika
 */
public class PAYMENT {
    
    //Creates a DBManager instance to handle database operations.
    DBManager dbManager = new DBManager();
    
    public boolean addPayment(String book_ref_no, String bank_acc_num, String cvc, String name_on_card, String amount_of_tickets) {
        
        //Prepared statement and result set objects.
        PreparedStatement ps;
        ResultSet rs;
        
        // SQL query to insert payment into the database.
        String addQuery = "INSERT INTO PAYMENT( BOOK_REF_NO, BANK_ACCOUNT_NUMBER, CVC, NAME_ON_CARD)VALUES(?,?,?,?)";
        
        try {
            // Prepare the statement and set the parameters.
            ps = (PreparedStatement) dbManager.getConnection().prepareCall(addQuery);
            
            
            ps.setString(1, book_ref_no);
            ps.setString(2,bank_acc_num);
            ps.setString(3, cvc);
            ps.setString(4,name_on_card);
            
            // Execute the query and check if it's successful.
            if(ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            // Log the error and return false.
            Logger.getLogger(PAYMENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
           
        
    }
    
    
}
