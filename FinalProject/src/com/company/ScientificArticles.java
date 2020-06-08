package com.company;

import java.util.Scanner;

public class ScientificArticles implements Article {
    private String name;
    private String publishedAt;
    private int Auditory = 0;
    public ScientificArticles(String name,String publishedAt){
        this.name = name;
        this.publishedAt = publishedAt;
    }
    @Override
    public void readen() {
        System.out.println("Article was published at:"+publishedAt);
        Scanner scanner = new Scanner(System.in);
        while(name == scanner.nextLine()){
            Auditory++;
        }
        System.out.println("This article was seen by" +' '+ Auditory +' '+"users");
    }
    @Override
    public void morePictures() {
        System.out.println("All pictures was given by scientific companies. Article does not consist plagiarism");
    }

    @Override
    public void action() {
        readen();
        morePictures();
    }
}
