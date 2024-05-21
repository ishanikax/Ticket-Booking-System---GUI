/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_code;

/**
 *
 * @author Ishanika
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class UserIdGenerator {
    
    public int generateNewUserId(Connection conn) {
        Random rand = new Random();
        int newUserId = 0;
        boolean unique = false;

        while (!unique) {
            newUserId = rand.nextInt(90000) + 10000;

            String checkSql = "SELECT COUNT(*) AS count FROM Users WHERE user_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(checkSql)) {
                pstmt.setInt(1, newUserId);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next() && rs.getInt("count") == 0) {
                    unique = true; 
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return newUserId;
    }
}
