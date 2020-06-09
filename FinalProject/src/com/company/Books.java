package com.company;
import java.util.*;
public class Books {
    private String type;
    private String genre;
    Scanner scanner = new Scanner(System.in);

    public Books(){
        this.type = scanner.nextLine();
        this.genre = scanner.nextLine();
    }

    public void select(){
        if((type == "book" && (genre == "education" || genre == "school"))){
            EducationalBooks educationalBooks = new EducationalBooks();
            educationalBooks.action();
        }
        if((type == "book" && (genre == "literature" || genre == "drama"))){
            LiteratureBooks literatureBooks = new LiteratureBooks();
            literatureBooks.action();
        }
        if((type == "Article") && (genre == "science")){
            ScientificArticles scientificArticles = new ScientificArticles();
            scientificArticles.action();
        }
        if((type == "Article") && (genre == "fashion")){
            FashionArticles fashionArticles = new FashionArticles();
            fashionArticles.action();
        }
    }
}
