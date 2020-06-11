package com.company.Books;
import java.sql.*;

public class LiteratureBooks extends DatabaseToCatalog implements Book {
    private String name;
    private String genre;
    private int cost;


    public LiteratureBooks() {
        genre = null;
        cost = 0;
        name = null;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCost(int cost) {
     this.cost=cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void CheckExist(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
        Statement statement = con.createStatement();
        if (name !=null){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Literature WHERE book_name = "+name);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
                        + resultSet.getString(4) + " " + resultSet.getInt(5));
            }
            con.close();
        }
        else{
            System.out.println("Not found");
        }
    } catch (NullPointerException | SQLException | ClassNotFoundException e) {
        System.err.println(e.getMessage());
    }
}

    @Override
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
    public void hasAudioBook() {
        if (genre.equals(TypesOfBooks.Drama)) {
            System.out.println("Drama books have free audio book");
        } else {
            System.out.println("Audio book does not supported");
        }
    }
}
