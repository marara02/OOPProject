package Workers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Seller extends Manager {
    public int worktime;//in month
	public Seller(String n, String sn,int worktime) {
		super(n, sn);
		this.worktime=worktime;
		// TODO Auto-generated constructor stub
	}
	@Override 
	public int GetSalary() {
		return 100000;
		
	}
	
	public void SetWorktime(int worktime) {
		this.worktime=worktime;
	}
	public int GetWotktime() {
		return worktime;
	}
	@Override 
	public Boolean GetVacation () {
		if (worktime>3) {
			return true;
		}
		else {
		return false;	
		}
		
	}
	public void SaleBook(String book_name) {

		    try
		    {
		 
		      String myDriver = "org.gjt.mm.mysql.Driver";
		      String myUrl = "jdbc:mysql:localhost:3306/final project";
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, "zhanel", "1234");
		      
		     
		   
		      String query = "DELETE FROM  users WHERE book_name= ?";
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      preparedStmt.setString (1, book_name);

		      preparedStmt.execute();
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }

		  }
		
	
	public void SaleArticle (String article_name) {
		  try
		    {
		 
		      String myDriver = "org.gjt.mm.mysql.Driver";
		      String myUrl = "jdbc:mysql:localhost:3306/final project";
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, "zhanel", "1234");
		      
		     
		   
		      String query = "DELETE FROM  users WHERE book_name= ?";
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      preparedStmt.setString (1, article_name);

		      preparedStmt.execute();
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }

	}
	@Override
	public String toString () {
		return "Seller's personal information:{"
				+ Name +" " + Surname+", salary:"+salary+"}";
	}
	
	

}
