import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//File: JFrameDisableButton.java
//Author: Yandel Colón Rivera
//Date: 11/12/2025
//Class: COMP 2400 OOP
//Description: Creates a JFrame with a JButton that disables itself after the first click.
public class JFrameDisableButton {
    private static JFrame mainFrame;
    private static JPanel controlPanel;
    private static JButton button;

    public static void main(String[] args){
        mainFrame = new JFrame("Unclickable");
        mainFrame.setSize(400,400);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controlPanel = new JPanel();
        mainFrame.add(controlPanel);
        placeC(controlPanel);
        mainFrame.setVisible(true);
    }
    private static void placeC(JPanel panel){
        panel.setLayout(null);

        button = new JButton("Click Me");
        button.setBounds(100,100,100,30);
        button.setBackground(Color.red);
        panel.add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button.setEnabled(false);
            }
        });
    }

}
