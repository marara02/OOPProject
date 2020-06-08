package com.company;

import java.util.Scanner;

public class LiteratureBooks implements Book{
    Scanner scanner = new Scanner(System.in);
    private String name = scanner.nextLine();
    private String genre =scanner.nextLine();
    @Override
    public void read() {
        System.out.println(name.toUpperCase()+' '+"booked by 1000 of users");
    }

    @Override
    public boolean hasAudioBook() {
        if(genre == "Roman" || genre =="Detective" || genre == "Novel"){
            System.out.println("Book does not supported by Audio");
            return false;
        }
        else {
            System.out.println("Book has audio version");
            return true;
        }
    }

    @Override
    public void action() {
        read();
        hasAudioBook();
    }
}
