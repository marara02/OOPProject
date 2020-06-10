package com.company.Books;

import com.mysql.jdbc.SQLError;

import java.sql.*;

public class LiteratureBooks implements Book {
    private String name;
    private int cost;
    TypesOfBooks typesOfBooks;

    public void setLiterature(int cost, String name, TypesOfBooks typesOfBooks) {
        this.cost = cost;
        this.name = name;
        this.typesOfBooks = typesOfBooks;
    }

    public void CheckForCost() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
            Statement statement = con.createStatement();
            if (cost >= 1000) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Literature WHERE cost > 1000");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
                            + resultSet.getString(4) + " " + resultSet.getInt(5));
                }
                con.close();
            }
            if (cost < 1000) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Literature WHERE cost < 1000");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + ":" + resultSet.getString(2) + ":" + resultSet.getString(3) + ":"
                            + resultSet.getString(4) + ":" + resultSet.getInt(5));
                }
                con.close();
            }
        } catch (NullPointerException | SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void read() {
        System.out.println("Catalog of Literature books");
    }

    @Override
    public boolean hasAudioBook() {
        if (typesOfBooks == TypesOfBooks.Drama) {
            return true;
        } else {
            return false;
        }
    }
}
