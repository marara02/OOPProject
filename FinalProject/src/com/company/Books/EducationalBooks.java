package com.company.Books;

import java.sql.*;
import java.util.*;

public class EducationalBooks extends Grade implements Book,HighSchoolProgramBooks {
    private int grade;
    private int cost;
    private String name;
    private Set<EducationalBooks> parents;
    TypesOfBooks bookType;

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

    @Override
    public String toString() {
        return "EducationalBooks{" +
                "grade=" + grade +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", bookType=" + bookType +
                '}';
    }

    public static class BuilderBook {
        private EducationalBooks newEducational;

        public BuilderBook() {
            newEducational = new EducationalBooks();
        }

        public BuilderBook withName(String name) {
            newEducational.name = name;
            return this;
        }
        public BuilderBook withGrade(int grade){
            newEducational.grade=grade;
            return this;
        }
        public BuilderBook withParents(Set<EducationalBooks>parents){
            newEducational.parents=parents;
            return this;
        }
        public EducationalBooks build(){
            return newEducational;
        }
    }
    public void AllEduBooks(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
            Statement statement = con.createStatement();
            if (grade!=0 && name!=null) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM educational ORDER BY grade ASC ");
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
    public boolean CheckExist() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
            Statement statement = con.createStatement();
            if (grade!=0) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM educational WHERE grade = '"+grade+"'");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " "
                            + resultSet.getInt(4) + " " + resultSet.getString(5));
                }
                con.close();
                return true;
            }
            else{
                return false;
            }
        } catch (NullPointerException | SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void hasAudioBook() {
        if(grade == 1 || grade == 2){
            System.out.println("Audio book required");
        }
        else{
            System.out.println("Book without audio");
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

    public void Buy(){
        if(CheckExist()){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
                Statement statement = con.createStatement();
                String sql = "DELETE * FROM educational WHERE subject = '"+name+"'AND grade = '"+grade+"'";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                preparedStatement.executeUpdate();
            }
            catch (NullPointerException | SQLException | ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
