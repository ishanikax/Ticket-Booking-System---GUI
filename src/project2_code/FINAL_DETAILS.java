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
public class FINAL_DETAILS {
    
    DBManager dbManager = new DBManager();
    
    public boolean addFinalDetails(String email, String phone, String amount_of_tickets, String total_cost, String book_ref_no) {
        
        PreparedStatement ps;
        ResultSet rs;
        String addQuery = "INSERT INTO FINAL_DETALS(EMAIL, PHONE_NUMBER, AMOUNT_OF_TICKETS, TOTAL_COST, BOOK_REF_NO)VALUES(?,?,?,?)";
        
        try {
            ps = (PreparedStatement) dbManager.getConnection().prepareCall(addQuery);
            
            
            ps.setString(1, email);
            ps.setString(2,total_cost);
            ps.setString(3, phone);
            ps.setString(4,amount_of_tickets);
            ps.setString(5, book_ref_no);
            
            if(ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FINAL_DETAILS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
           
        
    }
    
    
}
