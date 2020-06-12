package Workers;


public class Main {
    public static void main(String[] args) {
    	
Boss boss=new Boss("Assem", "Assemova");
System.out.println(boss.toString());
        Manager manager = new Manager("Marara","Nuraly");
        System.out.println(manager.toString());
        Seller seller=new Seller("Lila", "Kim",3);
        System.out.println(seller.toString());
        
        manager.AddBook();
        
        
        /*User user = new User();
        Scanner ss = new Scanner(System.in);
        String full_name = ss.nextLine();
        String email = ss.nextLine();
        user.setAll(full_name,email);
        user.Information_and_choose();
       /* LiteratureBooks literatureBooks = new LiteratureBooks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name,genre,cost");
        String name = scanner.nextLine();
        int cost =scanner.nextInt();
        TypesOfBooks typesOfBooks;
        literatureBooks.setLiterature(cost,name,TypesOfBooks.valueOf("History"));
        literatureBooks.CheckForCost();*/
    }
