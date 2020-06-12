package Workers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

//import  com.company.Books;


public class Manager extends Worker{
	 

	public Manager(String n, String sn) {
		super(n, sn);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public int GetSalary() {
		return 200000;
		
	}
	@Override 
	public Boolean GetVacation () {
		return true;
	}
	
	public void AddBook() {
		System.out.println("Please Choose the purpose of the book:");
		System.out.println("1.Literature");
		System.out.println("2.Education");
		Scanner book = new Scanner(System.in);
		 int purpose =book.nextInt();
		 switch (purpose) {
		 case 1:
	           
		/* Statement statement = connection.createStatement();
		 statement.executeUpdate("INSERT INTO literature (id,book_name,author,genre,cost)" + 
		            "VALUES (?,?,?,?,?)");
	          */  
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
	            
	            try
	            {
	              // create a mysql database connection
	            	String myDriver = "org.gjt.mm.mysql.Driver";
	              String myUrl = "jdbc:mysql:localhost:3306/final project";
	           
	              Class.forName(myDriver);
	              Connection conn = DriverManager.getConnection(myUrl, "zhanel", "1234");
	              
	              Statement st = conn.createStatement();

	              // the mysql insert statement
	              String query = ("INSERT INTO literature (id,book_name,author,genre,cost)" + 
	  		            "VALUES (?,?,?,?,?)");

	              // create the mysql insert preparedstatement
	              PreparedStatement preparedStmt = conn.prepareStatement(query);
		            preparedStmt.setInt (1, id);
		            preparedStmt.setString (2, book_name);
		            preparedStmt.setString  (3, author);
		            preparedStmt.setString (4, genre);
		            preparedStmt.setInt    (5, cost);
		            System.out.println("Inserted book:"+book);

	              // execute the preparedstatement
	              preparedStmt.execute();
	              
	              conn.close();
	            }
	            catch (Exception e)
	            {
	              System.err.println("Got an exception!");
	              System.err.println(e.getMessage());
	            }
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
	            try
	            {
	              // create a mysql database connection
	            	String myDriver = "org.gjt.mm.mysql.Driver";
	              String myUrl = "jdbc:mysql:localhost:3306/final project";
	           
	              Class.forName(myDriver);
	              Connection conn = DriverManager.getConnection(myUrl, "zhanel", "1234");
	              
	              Statement st = conn.createStatement();

	              // the mysql insert statement
	              String query = ("INSERT INTO educational (id,subject,grade,cost,author)" + 
	  		            "VALUES (?,?,?,?,?)");

	              // create the mysql insert preparedstatement
	              PreparedStatement preparedStmt = conn.prepareStatement(query);
		            preparedStmt.setInt (1, id2);
		            preparedStmt.setString (2, subject);
		            preparedStmt.setString  (3, grade);
		            preparedStmt.setInt (4, cost2);
		            preparedStmt.setString    (5, author2);
		            System.out.println("Inserted book:"+book);

	              // execute the preparedstatement
	              preparedStmt.execute();
	              
	              conn.close();
	            }
	            catch (Exception e)
	            {
	              System.err.println("Got an exception!");
	              System.err.println(e.getMessage());
	            }
	          }
	}
	public void  AddArticle()
	{
		 Scanner article = new Scanner(System.in);
         System.out.println("Enter the id of the new article ");
         int id=article.nextInt();
         System.out.println("Enter the name of the new article ");
         String article_name =article.nextLine(); 
         System.out.print("Enter the author of the new article ");
         String genre=article.nextLine();
         System.out.println("Enter the genre of the new article ");
         String published_at=article.nextLine();
         System.out.print("Enter the cost of the new article ");
         int cost =article.nextInt();
         
         try
         {
           // create a mysql database connection
         	String myDriver = "org.gjt.mm.mysql.Driver";
           String myUrl = "jdbc:mysql:localhost:3306/final project";
        
           Class.forName(myDriver);
           Connection conn = DriverManager.getConnection(myUrl, "zhanel", "1234");
           
           Statement st = conn.createStatement();

           // the mysql insert statement
           String query = ("INSERT INTO article (id,article_name,genre,published_at,cost)" + 
		            "VALUES (?,?,?,?,?)");

           // create the mysql insert preparedstatement
           PreparedStatement preparedStmt = conn.prepareStatement(query);
	            preparedStmt.setInt (1, id);
	            preparedStmt.setString (2, article_name);
	            preparedStmt.setString  (3, genre);
	            preparedStmt.setString (4, published_at);
	            preparedStmt.setInt    (5, cost);
	            System.out.println("Inserted book:"+article);

           // execute the preparedstatement
           preparedStmt.execute();
           
           conn.close();
         }
         catch (Exception e)
         {
           System.err.println("Got an exception!");
           System.err.println(e.getMessage());
         }
       }
	@Override
	public String toString () {
		return "Manager's personal information:{"
				+ Name +" " + Surname+", salary:"+salary+"}";
	}
	}	            

	           

	


