package com.company.User;
import com.company.Books.*;
import com.company.Article.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class User implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Scanner scanner = new Scanner(System.in);

        DatabaseToCatalog databaseToCatalog = new DatabaseToCatalog();
        databaseToCatalog.Connect();

        System.out.println("-----HELLO, HALO-----");
        System.out.println("What do you want to buy?");
        String type = scanner.nextLine();
        if(type.equals("book")){
            System.out.println("For which purposes do you need?");
           String purpose = scanner.nextLine();
           if(purpose.equals("Educational")){
               int grade = scanner.nextInt();
               int cost = scanner.nextInt();
               String name = scanner.nextLine();
               EducationalBooks educationalBooks = new EducationalBooks();
               educationalBooks.setName(name);
               educationalBooks.setCost(cost);
               educationalBooks.AllEduBooks();
               educationalBooks.CheckExist();
               educationalBooks.CheckForCost();
           }
           if(purpose.equals("Literature")){
               String genre = scanner.nextLine();
               int cost = scanner.nextInt();
               String name = scanner.nextLine();
               LiteratureBooks literatureBooks = new LiteratureBooks();
               literatureBooks.CheckExist();
           }
        }
        if(type.equals("Article")){
           System.out.println("What must consist article?");
           String genre = scanner.nextLine();
           try {
               if(genre.equals("Science")){
                   System.out.println("name:");
                   String name = scanner.nextLine();
                   ScientificArticles scientificArticles = new ScientificArticles();
                   scientificArticles.setName(name);
                   scientificArticles.count_article();
           }
               else{
                   System.out.println("name:");
                   String name2 = scanner.nextLine();
                   FashionArticles fashionArticles = new FashionArticles();
                   fashionArticles.setName(name2);
                   System.out.println(fashionArticles.getName());
                   fashionArticles.count_article();
               }
           }
           catch (NullPointerException e){
               System.err.println(e.getMessage());
           }
        }
        }
    }
