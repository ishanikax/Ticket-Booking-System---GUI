/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_code;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ishanika
 */
public class USERS {
    
    DBManager dbManager = new DBManager();
    
    public boolean addUser(String fname, String lname, String phone, String email) {
        
        PreparedStatement ps;
        ResultSet rs;
        String addQuery = "INSERT INTO USERS(FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL)VALUES(?,?,?,?)";
        
        try {
            ps = (PreparedStatement) dbManager.getConnection().prepareCall(addQuery);
            
            ps.setString(1,fname);
            ps.setString(2, lname);
            ps.setString(3,phone);
            ps.setString(4, email);
            
            if(ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
           
        
    }
    
}
