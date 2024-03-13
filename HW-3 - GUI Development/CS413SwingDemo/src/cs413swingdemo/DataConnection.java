package cs413swingdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karunmehta
 */
public class DataConnection {
    
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/CS413";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1600Holloway@78";

    private static String ADMIN_USERNAME;
    private static String ADMIN_PASSWORD;
    
    // JDBC variables for opening and managing connection
    private static Connection myConnection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries to be used to persist business objects as needed by the DAO
    private static final String INSERT_SQL = "INSERT INTO Employee (username, email) VALUES (?, ?)";
    private static final String SELECT_SQL_BYID = "SELECT * FROM Employee WHERE id = ?";
    private static final String UPDATE_SQL = "UPDATE Employee SET username = ?, email = ?, phone = ? WHERE id = ?";
    private static final String DELETE_SQL = "DELETE FROM Employee WHERE id = ?";    
 
    public DataConnection()  { } 
    
    public static Connection getDBConnection() throws SQLException {
        
        
        myConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        
        return myConnection;
    }
    
    public static String getInsert() {
        
        return INSERT_SQL;
    }
    
    public static String getUpdate() {
        
        return UPDATE_SQL;
    }
    
    public static String getSelect() {
        
        return SELECT_SQL_BYID;
    }

    public static String getDelete() {
        
        return DELETE_SQL;
    }
    
    public static String getURL() {
        
        return URL;
    }

    public static String getUsername() {
        
        return USERNAME;
    }

    public static String getPWD() {
        
        return PASSWORD;
    }
    
}
