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
public class TICKETS {

    
    DBManager dbManager = new DBManager();
    
    public boolean addTickets(String ticket_type, String ticket_amount, String price, String total_cost, String event) {
        
        PreparedStatement ps;
        ResultSet rs;
        String addQuery = "INSERT INTO TICKETS(TICKET_TYPE, AMOUNT_OF_TICKETS, PRICE, TOTAL_COST, EVENT)VALUES(?,?,?,?,?)";
        
        try {
            ps = (PreparedStatement) dbManager.getConnection().prepareCall(addQuery);
            
            
            ps.setString(1,ticket_type);
            ps.setString(2, ticket_amount);
            ps.setString(3,price);
            ps.setString(4, total_cost);
            ps.setString(5,event);
            
            if(ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TICKETS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
           
        
    }
    
}
    

