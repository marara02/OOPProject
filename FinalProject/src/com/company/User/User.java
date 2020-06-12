package com.company.User;
import com.company.Books.*;
import com.company.Article.*;
import com.company.Workers.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class User implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Scanner scanner = new Scanner(System.in);

        DatabaseToCatalog databaseToCatalog = new DatabaseToCatalog();
        databaseToCatalog.Connect();

        System.out.println("-----HELLO, HALO-----");
        System.out.println("-----------Soul-Mara=>The newest bookshop in the world");
        System.out.println("What do you want to buy?");
        String type = scanner.nextLine();
        if (type.equals("book")) {
            System.out.println("For which purposes do you need?");
            String purpose = scanner.nextLine();
            if (purpose.equals("Educational")) {
                System.out.print("Enter your grade:");
                int grade = scanner.nextInt();
                System.out.print("Enter book name:");
                String name = scanner.nextLine();
                EducationalBooks educationalBooks = new EducationalBooks.BuilderBook()
                        .withGrade(grade)
                        .withName(name)
                        .build();
                educationalBooks.CheckExist();
                if (educationalBooks.CheckExist()) {
                    educationalBooks.hasAudioBook();
                    educationalBooks.OnlineBooks();
                    System.out.println("Are you sure to buy?");
                    String ans = scanner.nextLine();
                    if (ans.equals("yes")) {
                        Seller seller = new Seller("Aya", "Shalkar", 12);
                        seller.SaleBook(name);
                    } else {
                        System.out.println("Continue choose");
                    }
                }
            }
            if (purpose.equals("Literature")) {
                System.out.print("Enter name:");
                String name = scanner.nextLine();
                LiteratureBooks literatureBooks = new LiteratureBooks.bookBuilder()
                        .withName(name)
                        .build1();
                literatureBooks.CheckExist();
                if (literatureBooks.CheckExist()) {
                    System.out.println("Are you sure to buy?");
                    String answer = scanner.nextLine();
                    if (answer.equals("yes")) {
                        Seller seller = new Seller("Aya", "Shalkar", 12);
                        seller.SaleBook(name);
                        //literatureBooks.Buy();
                    } else {
                        System.out.println("Continue choosing");
                    }
                } else {
                    System.out.println("Does not exist:(");
                }
                if (type.equals("Article")) {
                    System.out.println("What must consist article?");
                    String genre = scanner.nextLine();
                    try {
                        if (genre.equals("Science")) {
                            System.out.println("name:");
                            String name1 = scanner.nextLine();
                            ScientificArticles scientificArticles = new ScientificArticles.Builder()
                                    .withName(name1)
                                    .build();
                            scientificArticles.count_article();
                            System.out.println("Are you sure to buy?");
                            String answer = scanner.nextLine();
                            if (answer.equals("yes")) {
                                Seller seller = new Seller("Aya", "Shalkar", 12);
                                seller.SaleArticle(name1);
                            } else {
                                System.out.println("Continue to choose");
                            }
                        } else {
                            System.out.println("name:");
                            String name2 = scanner.nextLine();
                            FashionArticles fashionArticles = new FashionArticles.BuilderArticle()
                                    .withName(name2)
                                    .build();
                            fashionArticles.count_article();
                            System.out.println("Are you sure to buy?");
                            String answer = scanner.nextLine();
                            if (answer.equals("yes")) {
                                Seller seller = new Seller("Aya", "Shalkar", 12);
                                seller.SaleArticle(name);
                            } else {
                                System.out.println("Continue to choose");
                            }
                        }
                    } catch (NullPointerException e) {
                        System.err.println(e.getMessage());
                    }
                }
            }
        }
    }
}
