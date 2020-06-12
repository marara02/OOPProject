package com.company;
import com.company.User.*;
import com.company.Workers.Manager;
import java.awt.*;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    Main(){
        JFrame f = new JFrame("Button");
        f.setSize(200,200);
        JLabel label = new JLabel("Soul-Mara, The newest bookshop",JLabel.CENTER);
        JButton b = new JButton("User");
        b.setBounds(50, 100, 100, 40);
        b.setBackground(java.awt.Color.ORANGE);
        b.setOpaque(true);
        b.addActionListener((ActionListener) new User());

        JButton b2 = new JButton("Worker");
        b2.setBounds(160, 100, 100, 40);
        b2.setBackground(java.awt.Color.MAGENTA);
        b2.setOpaque(true);
        b2.addActionListener(new Manager("Janel","Kaiyrbekova"));

        f.add(label);
        f.add(b);
        f.add(b2);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Main();
    }
}
