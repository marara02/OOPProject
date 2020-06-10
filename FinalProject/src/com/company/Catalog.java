package com.company;
import java.util.*;
import com.company.Books.TypesOfBooks;
import com.company.Books.LiteratureBooks;
import com.company.Books.Book;
import com.company.Books.EducationalBooks;
import com.company.Article.Article;
import com.company.Article.*;

public class Catalog {
    private String type;
    TypesOfBooks typesOfBooks;
    TypesOfArticle typesOfArticle;
    public void Sort__Book(String type,TypesOfBooks typesOfBooks){  //Implementation of Factory method
        this.type=type;
        this.typesOfBooks=typesOfBooks;
    }

    public void Sort_Article(String type,TypesOfArticle typesOfArticle){
        this.type=type;
    }
    public Book Book(){
        if(type.equals("book")){
            if(typesOfBooks == TypesOfBooks.History || typesOfBooks== TypesOfBooks.Math_copybook
            ||typesOfBooks == TypesOfBooks.Math || typesOfBooks== TypesOfBooks.Biology){
                return new EducationalBooks();
            }
            else{
                return new LiteratureBooks();
            }
        }
        return null;
    }
    public Article Article(){
        if(type.equals("Article")){
            if(typesOfArticle== TypesOfArticle.NASA || typesOfArticle== TypesOfArticle.National_Geographic){
                return new ScientificArticles();
            }
            else {
                return new FashionArticles();
            }
        }
        return null;
    }
}