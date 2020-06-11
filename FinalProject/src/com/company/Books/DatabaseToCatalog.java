package com.company.Books;

import java.sql.*;

public class DatabaseToCatalog {

    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping", "root", "123456");
            Statement statement = con.createStatement();
            System.out.println("Books for School");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM educational");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "|" + resultSet.getString(2) + "|" + resultSet.getInt(3) + "|"
                        + resultSet.getInt(4) + "|" + resultSet.getString(5));
            }

            System.out.println("Literature books");
            ResultSet resultSet2 = statement.executeQuery("SELECT * FROM literature");
            while (resultSet2.next()) {
                System.out.println(resultSet2.getInt(1) + "|" + resultSet2.getString(2) + "|" + resultSet2.getString(3) + "|"
                        + resultSet2.getString(4) + "|" + resultSet2.getInt(5));
            }
            System.out.println("Articles with variety of theme");
            ResultSet resultSet3 = statement.executeQuery("SELECT * FROM articles");
            while (resultSet3.next()) {
                System.out.println(resultSet3.getInt(1) + "|" + resultSet3.getString(2) + "|" + resultSet3.getInt(3) + "|"
                        + resultSet3.getDate(4) + "|" + resultSet3.getInt(5));
            }
            con.close();
        }
    catch (NullPointerException | SQLException | ClassNotFoundException e) {
        System.err.println(e.getMessage());
    }
}
}