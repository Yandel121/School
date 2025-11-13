import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//File: JFrameDisableButton2.java
//Author: Yandel Colón Rivera
//Date: 11/12/2025
//Class: COMP 2400 OOP
//Description: Modifies JFrameDisableButton so the JButton disables after 8 clicks and displays a JLabel “That’s enough!”.

public class JFrameDisableButton2 {
        private static JFrame mainFrame;
        private static JPanel controlPanel;
        private static JButton button;
        private static int count;

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
                public void actionPerformed(ActionEvent e) {
                    count++;
                    if (count >= 8) {
                        button.setEnabled(false);
                    }
                }
            });
        }

    }

