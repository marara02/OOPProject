package com.company.Workers;

import java.sql.*;
import java.util.*;

public class Manager extends Boss {



    public Manager(String n, String sn) {

        super(n, sn);

        // TODO Auto-generated constructor stub

    }

    @Override

    public int GetSalary() {

        return 200000;



    }

    @Override

    public Boolean GetVacation () {

        return true;

    }

    public void AddBook() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM literature");

            Scanner book = new Scanner(System.in);
            //System.out.println("Enter the id of the new book ");
            //int id=book.nextInt();
            System.out.println("Enter the name of the new book ");
            String book_name =book.nextLine();
            System.out.println("Enter the author of the new book ");
            String author=book.nextLine();
            System.out.println("Enter the genre of the new book ");
            String genre=book.nextLine();
            System.out.println("Enter the cost of the new book ");
            int cost =book.nextInt();
            statement.executeUpdate("INSERT INTO literature (id,book_name,author,genre,cost)" +
                    "VALUES ("+book_name+","+author+","+genre+","+cost+")");

            System.out.println("Inserted book:"+book);


            resultSet.close();
            statement.close();
            connection.close();



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
