package com.company.Books;

import java.sql.*;

public class DatabaseToCatalog {
    Connection connection;
    public void Connect(){
        String url = "jdbc:mysql://localhost:3306/Clients";
        String user = "root";
        String password = "123456";
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Successfully connected");
            if(connection==null){
                System.out.println("Error");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}