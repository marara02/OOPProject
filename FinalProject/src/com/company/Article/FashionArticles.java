package com.company.Article;

import java.sql.*;
import java.util.Scanner;

public class FashionArticles implements Article {
    private String name;
    private String genre;

    public void setInfo(String name,String genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public void count_article() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping","root","123456");
            Statement statement = con.createStatement();
            if (genre.equals("fashion")) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Articles ORDER BY published_at DESC " +
                        "WHERE genre = 'fashion' OR genre = 'business'");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
                            + resultSet.getString(4) + " " + resultSet.getInt(5));
                }
                con.close();
            }
            if(name.equals(TypesOfArticle.ELLE)){
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Articles WHERE name='ELLE'");
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
