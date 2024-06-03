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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DBManager {
    //This class manages the database connection.
    
    //Let the database expot into a file and then upload to github and modify the code and specify a path to read the digital database
    //Dynamically generate the database when the code runs

    //Database credentials and URL.
    private static final String USER_NAME = "tempotickets"; //your DB username
    private static final String PASSWORD = "pdc"; //your DB password
    private static final String URL = "jdbc:derby://localhost:1527/TempoTicketsDB";  //url of the DB host

    //Connection object.
    Connection conn;

    //Constructor to establish the connection.
    public DBManager() {
        establishConnection();
    }

    //Main method to test the connection.
    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        System.out.println(dbManager.getConnection());
    }

    //Method to get the connection.
    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TempoTicketsDB", USER_NAME, PASSWORD);
        
            System.out.println("Connection established successfully.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error establishing connection: " + ex.getMessage());
        }
    }

    //Method to close the connection.      
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    //Method to execute the SQL query.
    public ResultSet queryDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    //Method to execute a SQL update statement.
    public void updateDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    

}

