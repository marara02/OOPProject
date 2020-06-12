package com.company.Books;

public abstract class Grade {
    private int grade;
    Grade(){
        grade=0;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
