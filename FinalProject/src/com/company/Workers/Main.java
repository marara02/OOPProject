package Workers;


public class Main {
    public static void main(String[] args) {
    	System.out.println("Here we will give you general information about workers");
Boss boss=new Boss("Assem", "Assemova");
System.out.println(boss.toString());
        Manager manager = new Manager("Marara","Nuraly");
        System.out.println(manager.toString());
        Seller seller=new Seller("Lila", "Kim",3);
        System.out.println(seller.toString());
        
        manager.AddBook();
        manager.AddArticle();
        
 
    }
}
