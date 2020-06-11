package com.company.Books;

import java.sql.*;

public class EducationalBooks extends Grade implements Book,HighSchoolProgramBooks {
    private int grade;
    private int cost;
    private String name;
    TypesOfBooks bookType;

    public EducationalBooks(){
        super();
        cost=0;
        name=null;
    }

    @Override
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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

    public void AllEduBooks(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
            Statement statement = con.createStatement();
            if (grade!=0 && name!=null) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM educational WHERE grade='"+grade);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "|" + resultSet.getString(2) + "|" + resultSet.getInt(3) + "|"
                            + resultSet.getInt(4) + "|" + resultSet.getString(5));
                }
                con.close();
            }
        } catch (NullPointerException | SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    @Override
    public void CheckExist() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
            Statement statement = con.createStatement();
            if (grade!=0 && name!=null) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM educational WHERE grade = '"+grade+"' AND name='"+name);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
                            + resultSet.getString(4) + " " + resultSet.getInt(5));
                }
                con.close();
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
            if (cost >= 3000) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM educational WHERE cost >= 3000");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
                            + resultSet.getString(4) + " " + resultSet.getInt(5));
                }
                con.close();
            }
            if (cost < 3000) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Literature WHERE cost < 3000");
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
        if(grade == 1 || grade == 2){
            System.out.println("Audio book required");
        }
    }

    @Override
    public void OnlineBooks() {
       if(grade == 10 || grade ==11) {
           if (bookType == TypesOfBooks.History) {
               System.out.println("Online books");
           }
       }
    }
}
