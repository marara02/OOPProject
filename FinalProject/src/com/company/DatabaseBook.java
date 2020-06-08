package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseBook {
    private static DatabaseBook instance;
    private Connection connection;
    private DatabaseBook() {
        System.out.println("--------------------------Book catalog----------------------------");

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is MySQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("MySQL JDBC Driver Registered!");

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookshopping"
                    ,"root","123456");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }
    public static DatabaseBook getInstance() {
        if (DatabaseBook.instance == null)
            DatabaseBook.instance = new DatabaseBook();
        return DatabaseBook.instance;
    }
    public void query(String sql) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            while(resultSet.next())
                System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("Book_name"),
                        resultSet.getString("Category"));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
