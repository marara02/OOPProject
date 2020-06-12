package Workers;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  
    	public static void main(String args[])throws FileNotFoundException{
    	System.out.println("Here we will give you general information about workers");
    	Boss boss=new Boss("Assem", "Assemova");
    	System.out.println(boss.toString());
        Manager manager = new Manager("Marara","Nuraly");
        System.out.println(manager.toString());
        Seller seller=new Seller("Lila", "Kim",3);
        System.out.println(seller.toString());
        
        try (Scanner article = new Scanner(System.in)) {
			System.out.println("Enter the id of the new article ");
			int idArticle=article.nextInt();
			System.out.println("Enter the name of the new article ");
			String article_name =article.nextLine(); 
			System.out.println("Enter the author of the new article ");
			String genreArticle=article.nextLine();
			System.out.println("Enter the genre of the new article ");
			String published_at=article.nextLine();
			System.out.print("Enter the cost of the new article ");
			int costArticle =article.nextInt();
			manager.AddArticle(idArticle,article_name,genreArticle,published_at,costArticle);
		}
        System.out.println("Please Choose the purpose of the book:");
		System.out.println("1.Literature");
		System.out.println("2.Education");
		
		 try (Scanner book = new Scanner(System.in)) {
			int purpose =book.nextInt();
			 
			 switch (purpose) {
			 case 1:
				  	System.out.println("Enter the id of the new book ");
			        int id=book.nextInt();
			        System.out.println("Enter the name of the new book ");
			        String book_name =book.nextLine(); 
			        System.out.print("Enter the author of the new book ");
			        String author=book.nextLine();
			        System.out.println("Enter the genre of the new book ");
			        String genre=book.nextLine();
			        System.out.print("Enter the cost of the new book ");
			        int cost =book.nextInt();
				    manager.AddLiteratureBook( id, book_name,  author,  genre,  cost);
			 case 2:
				 
				 	System.out.println("Enter the id of the new book ");
			        int id2=book.nextInt();
			        System.out.println("Enter the subject of the new book ");
			        String subject =book.nextLine(); 
			        System.out.print("Enter the grade  of the new book ");
			        String grade=book.nextLine();
			        System.out.print("Enter the cost of the new book ");
			        int cost2 =book.nextInt();
			        System.out.println("Enter the author of the new book ");
			        String author2=book.nextLine();
			        manager.AddEducationalBook(id2, subject, grade, cost2, author2);
      
   
   }
		}
}
}

