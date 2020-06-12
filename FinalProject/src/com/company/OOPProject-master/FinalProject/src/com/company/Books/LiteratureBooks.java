package com.company.Books;
import java.sql.*;

public class LiteratureBooks extends DatabaseToCatalog implements Book {
    private String name;
    private String genre;
    private int cost;

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

    public void setGenre(String genre){
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }

    public static class bookBuilder{
        private LiteratureBooks newLiteraturebooks;
        public bookBuilder(){
            newLiteraturebooks = new LiteratureBooks();
        }
        public bookBuilder withName(String name){
            newLiteraturebooks.name=name;
            return this;
        }
        public bookBuilder withCost(int cost){
            newLiteraturebooks.cost=cost;
            return this;
        }
        public bookBuilder withGenre(String genre){
            newLiteraturebooks.genre=genre;
            return this;
        }
        public LiteratureBooks build1(){
            return newLiteraturebooks;
        }
    }
    @Override
    public boolean CheckExist(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
        Statement statement = con.createStatement();
        if (name !=null){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Literature WHERE book_name = '"+name+"'");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
                        + resultSet.getString(4) + " " + resultSet.getInt(5));
            }
            con.close();
        }
        else{
            System.out.println("Not found");
            return false;
        }
    } catch (NullPointerException | SQLException | ClassNotFoundException e) {
        System.err.println(e.getMessage());
    }
    return true;
}

    @Override
    public void hasAudioBook() {
        if (genre.equals(TypesOfBooks.Drama)) {
            System.out.println("Drama books have free audio book");
        } else {
            System.out.println("Audio book does not supported");
        }
    }

    public void Buy() {
        if(CheckExist()){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
                Statement statement = con.createStatement();
                String sql = "DELETE * FROM literature WHERE book_name = '"+name+"'";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                preparedStatement.executeUpdate();
            }
            catch (NullPointerException | SQLException | ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
