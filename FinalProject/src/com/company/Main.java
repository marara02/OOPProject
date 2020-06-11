package com.company;
import com.company.Books.LiteratureBooks;
import com.company.Books.TypesOfBooks;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Main {
    Main(){
        JFrame f=new JFrame("Button");
        JButton b=new JButton("User");
        b.setBounds(50,100,100, 40);
        b.setBackground(java.awt.Color.cyan);
        b.setOpaque(true);
        JButton b2=new JButton("Worker");
        b2.setBounds(160,100,100, 40);
        b2.setBackground(java.awt.Color.PINK);
        b2.setOpaque(true);
        f.add(b);
        f.add(b2);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
      new Main();
}
