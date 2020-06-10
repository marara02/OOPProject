package com.company.Books;

public class EducationalBooks implements Book,HighSchoolProgramBooks,SecondarySchoolBooks {
    private int grade;
    TypesOfBooks bookType;

    public void SetEducationalBooks(int grade,TypesOfBooks bookType){
        this.grade=grade;
        this.bookType = bookType;
    }

    @Override
    public void read() {
        System.out.println("For school auditory");
    }

    @Override
    public boolean hasAudioBook() {
        if(grade == 1 || grade == 2){
            System.out.println("Audio book required");
            return true;
        }
        return false;
    }

    @Override
    public void OnlineBooks() {
       if(grade == 10 || grade ==11) {
           if (bookType == TypesOfBooks.History) {
               System.out.println("Online books");
           }
       }
    }

    @Override
    public boolean isFree() {
        if(grade == 1){
            if(bookType == TypesOfBooks.Math_copybook || bookType ==TypesOfBooks.English){
                return true;
            }
        }
        return false;
    }
}
