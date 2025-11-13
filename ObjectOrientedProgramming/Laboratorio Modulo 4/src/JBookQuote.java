//File: JBookQuote.java
//Author: Yandel Colón Rivera
//Date: 11/12/2025
//Class: COMP 2400 OOP
//Description: Displays a JFrame with the opening sentence(s) from my favorite book.
import javax.swing.*;
import java.awt.*;
public class JBookQuote {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel authorLabel;
    private JLabel titleLabel;
    public JBookQuote() {
        prepareGUI();
    }
    public static void main(String[] args) {
        JBookQuote quote = new JBookQuote();

    }
    private void prepareGUI() {
        mainFrame = new JFrame("Quotes");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));

        headerLabel = new JLabel("Quotes");
        authorLabel = new JLabel("Author:René Descartes");
        titleLabel = new JLabel("Qoute: Cogito Ergo Sum");

        mainFrame.add(headerLabel);
        mainFrame.add(authorLabel);
        mainFrame.add(titleLabel);

        mainFrame.setVisible(true);
    }


}
