package com.company.Article;

import java.sql.*;
import java.util.Scanner;

public class ScientificArticles implements Article {
    private String name;
    private int cost;

    @Override
    public void setName(String name) {
        this.name =name;
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

    public static class Builder{
        private ScientificArticles newScience;

        public Builder(){
            newScience = new ScientificArticles();
        }
        public ScientificArticles.Builder withName(String name) {
            newScience.name = name;
            return this;
        }

        public ScientificArticles.Builder withCost(int cost) {
            newScience.cost = cost;
            return this;
        }

        public ScientificArticles build() {
            return newScience;
        }
    }

    @Override
    public void count_article() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping", "root", "123456");
            Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Articles WHERE article_name ='"+name+"'");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
                            + resultSet.getString(4) + " " + resultSet.getInt(5));
                }
                con.close();
            }
        catch (NullPointerException | SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
