package com.company;
import com.company.Books.LiteratureBooks;
import com.company.Books.TypesOfBooks;

import java.sql.SQLException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws SQLException {
        LiteratureBooks literatureBooks = new LiteratureBooks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name,genre,cost");
        String name = scanner.nextLine();
        int cost =scanner.nextInt();
        TypesOfBooks typesOfBooks;
        literatureBooks.setLiterature(cost,name,TypesOfBooks.valueOf("History"));
        literatureBooks.CheckForCost();
    }
}
