package Workers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


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
	
	public Boolean  AddLiteratureBook(int id,String book_name, String author, String genre, int cost ) {
		
	            try
	            {
	              // create a mysql database connection
	            	String myDriver = "com.mysql.jdbc.Driver";
	              String url = "jdbc:mysql:localhost:3306/final project";
	           
	              Class.forName(myDriver);
	              Connection conn = DriverManager.getConnection(url, "zhanel", "1234");
	              
	           

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

	              // execute the preparedstatement
		            preparedStmt.executeUpdate();
		            conn.close();
	              
	            }
	            catch (Exception e)
	            {
	             
	              System.err.println(e.getMessage());
	            }
	            return false;
	}
		 public Boolean AddEducationalBook(int id2,String subject, String grade, int cost2,String author2) {
	            try
	            {
	              // create a mysql database connection
	            	String myDriver = "com.mysql.jdbc.Driver";
	              String url = "jdbc:mysql:localhost:3306/final project";
	           
	              Class.forName(myDriver);
	              Connection conn = DriverManager.getConnection(url, "zhanel", "1234");
	              
	             

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
		        

	              // execute the preparedstatement
		            preparedStmt.executeUpdate();
		            conn.close();
	            
	            }
	            catch (Exception e)
	            {
	             
	              System.err.println(e.getMessage());
	            }
	            return false;
	          }
	
	public Boolean AddArticle(int id,String article_name,String genre,String published_at,int cost)
	{
		
         
         try
         {
           // create a mysql database connection
         	String myDriver = "com.mysql.jdbc.Driver";
           String myUrl = "jdbc:mysql:localhost:3306/final project";
        
           Class.forName(myDriver);
           Connection conn = DriverManager.getConnection(myUrl, "zhanel", "1234");
           
      

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

           // execute the preparedstatement
           preparedStmt.executeUpdate();
           conn.close();
         }
         catch (Exception e)
         {
           System.err.println(e.getMessage());
         }
         return false;
       }
	@Override
	public String toString () {
		return "Manager's personal information:{"
				+ Name +" " + Surname+", salary:"+GetSalary()+"}";
	}
	}	            

	           

	


