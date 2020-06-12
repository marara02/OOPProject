package com.company.Article;

import com.company.Books.EducationalBooks;

import java.sql.*;
import java.util.Scanner;
import java.util.Set;

public class FashionArticles implements Article {
    private String name;
    private int cost;

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
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public static class BuilderArticle {
        private FashionArticles newFashion;

        public BuilderArticle() {
            newFashion = new FashionArticles();
        }

        public FashionArticles.BuilderArticle withName(String name) {
            newFashion.name = name;
            return this;
        }

        public FashionArticles.BuilderArticle withCost(int cost) {
            newFashion.cost = cost;
            return this;
        }

        public FashionArticles build() {
            return newFashion;
        }
    }
        @Override
        public void count_article() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping", "root", "123456");
                Statement statement = con.createStatement();
                if (name != null) {
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM Articles WHERE article_name='"+name+"'");
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
}
