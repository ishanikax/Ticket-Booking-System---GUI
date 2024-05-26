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
    
    DBManager dbManager = new DBManager();
    
    public boolean addPayment(String book_ref_no, String bank_acc_num, String cvc, String name_on_card, String amount_of_tickets) {
        
        PreparedStatement ps;
        ResultSet rs;
        String addQuery = "INSERT INTO PAYMENT( BOOK_REF_NO, BANK_ACCOUNT_NUMBER, CVC, NAME_ON_CARD)VALUES(?,?,?,?)";
        
        try {
            ps = (PreparedStatement) dbManager.getConnection().prepareCall(addQuery);
            
            
            ps.setString(1, book_ref_no);
            ps.setString(2,bank_acc_num);
            ps.setString(3, cvc);
            ps.setString(4,name_on_card);
            
            if(ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PAYMENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
           
        
    }
    
    
}
