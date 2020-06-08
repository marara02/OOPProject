package com.company;

import java.util.Scanner;

public class EducationalBooks implements Book,HighSchoolProgramBooks,SecondarySchoolBooks {
    Scanner scanner = new Scanner(System.in);
    private int grade = scanner.nextInt();
    private String bookType = scanner.nextLine();
    @Override
    public void read() {
        System.out.println("For school auditory");
    }

    @Override
    public boolean hasAudioBook() {
        System.out.println("Enter your grade:");
        if(grade == 1 || grade == 2){
            System.out.println("Audio book required");
            return true;
        }
        return false;
    }

    @Override
    public void OnlineBooks() {
       if(grade == 10 || grade ==11) {
           if (bookType == "History") {
               System.out.println("Online books");
           }
       }
    }

    @Override
    public boolean isFree() {
        if(grade == 1){
            if(bookType == "math copybook" || bookType == "english copybook"){
                return true;
            }
        }
        return false;
    }
    @Override
    public void action() {
        read();
        hasAudioBook();
        OnlineBooks();
        isFree();
    }
}
