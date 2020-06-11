package com.company.Article;

import java.sql.*;
import java.util.Scanner;

public class FashionArticles implements Article {
    private String name;
    private int cost;

    public FashionArticles() {
        name = null;
        cost= 0;
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
    public void count_article() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopping", "root", "123456");
            Statement statement = con.createStatement();
            if(name!=null){
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Articles WHERE genre='fashion' OR genre ='business'");
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
