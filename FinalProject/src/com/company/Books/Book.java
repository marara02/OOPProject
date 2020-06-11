package com.company.Books;

public interface Book {
    void setName(String name);
    String  getName();
    void setCost(int cost);
    int getCost();
    void CheckExist();
    void CheckForCost();
    void hasAudioBook();
}
