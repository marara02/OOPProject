package com.company;

import java.util.Scanner;

public class FashionArticles implements Article {
    Scanner scanner = new Scanner(System.in);
    private String name = scanner.nextLine();
    private String publishedAt;
    public FashionArticles(String publishedAt){
        this.publishedAt = publishedAt;
    }
    @Override
    public void readen() {
        System.out.println(name + ' '+"was read by 1000 people per year");
    }

    @Override
    public void morePictures() {
        System.out.println("All pictures was picked from ELLE and Forbes");
    }

    @Override
    public void action() {
        readen();
        morePictures();
    }
}
