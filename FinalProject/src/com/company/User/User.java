package com.company.User;
import com.company.Books.*;
import com.company.Article.*;

import java.util.Scanner;

public class User {
    private String full_name;
    private String email;

    public void setAll(String full_name,String email){
        this.full_name = full_name;
        this.email = email;
    }
    public void Information_and_choose(){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
       System.out.println("-----HELLO, HALO"+full_name+"-----");
       System.out.println("Choose your reachable from catalog");
       System.out.println("1.Books");
       System.out.println("2.Articles");
       switch (n){
           case 1:
           case 2:
               break;
           default:
       }
    }
}
