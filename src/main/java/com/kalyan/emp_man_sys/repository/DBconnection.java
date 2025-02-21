package com.kalyan.emp_man_sys.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public static Connection con;

    static {
        try {
            // Step 1: Load the required MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");  
            System.out.println("MySQL Driver loaded successfully!");

            // Step 2: Establish the connection
            final String URL = "jdbc:mysql://localhost:3306/company";  
            final String userName = "root";
            final String passWord = "2028";
            con = DriverManager.getConnection(URL, userName, passWord);
            System.out.println("Connection established successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load MySQL driver: " + e);
        } catch (SQLException e) {
            System.out.println("Failed to establish connection: " + e);
        }
    }

    public static Connection getConnection() {
        return con;
    }
}