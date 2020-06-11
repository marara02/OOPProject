package com.company;
import com.company.Books.LiteratureBooks;
import com.company.Books.TypesOfBooks;
import com.company.User.*;
import javafx.scene.paint.Color;

import java.awt.*;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

import static javafx.scene.paint.Color.GREEN;

public class Main implements ActionListener {
    Main(){
        JFrame f = new JFrame("Button");
        JTextArea textArea = new JTextArea();
        textArea.append("Welcome to Soul-Mara book shop!");
        textArea.setFont(Font.getFont(Font.SANS_SERIF));
        JButton b = new JButton("User");
        b.setBounds(50, 100, 100, 40);
        b.setBackground(java.awt.Color.ORANGE);
        b.setOpaque(true);
        b.addActionListener((ActionListener) new User());

        JButton b2 = new JButton("Worker");
        b2.setBounds(160, 100, 100, 40);
        b2.setBackground(java.awt.Color.MAGENTA);
        b2.setOpaque(true);
        f.add(textArea);
        f.add(b);
        f.add(b2);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws SQLException {
        new Main();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}

