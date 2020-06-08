package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("-----------------------------------WELCOME TO ONLINE BOOK SHOP------------------------------------------");

        FashionArticles fashionArticles = new FashionArticles("2020 April");
        ScientificArticles scientificArticles = new ScientificArticles("NASA","2020 April");
        EducationalBooks educationalBooks = new EducationalBooks();
        LiteratureBooks literatureBooks = new LiteratureBooks();

        DatabaseBook book = DatabaseBook.getInstance();
        book.query("SELECT * FROM books");

        System.out.println("Choose what type you want to purchase");
        System.out.println("1.Book");
        System.out.println("2.Article");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1:
                String type = scanner.nextLine();
                if(type.equals("Educational")){
                   educationalBooks.action();
                }
                if(type.equals("Literature")){
                    literatureBooks.action();
                }
                break;
            case 2:
                System.out.println("Choose liked article");
                String article = scanner.nextLine();
                if(article.equals("Scientific")){
                    scientificArticles.action();
                }
                if(article.equals("Fashion")){
                    fashionArticles.action();
                }
                break;
            default:
                return;
        }
    }
}
