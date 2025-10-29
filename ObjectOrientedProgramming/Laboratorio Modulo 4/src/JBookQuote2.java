import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JBookQuote2(){
        prepareGUI();
    }
    public static void main(String[] args){
        JBookQuote2 obj = new JBookQuote2();
        obj.showEvent();
    }
    private void prepareGUI(){
        mainFrame = new JFrame();
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(2,1));

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350,100);

        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(statusLabel);
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);

    }
    private void showEvent(){
        headerLabel.setText("Favorite Quotes");

        JButton authorButton = new JButton("Author");
        JButton titleButton = new JButton("Title");

        authorButton.setActionCommand("Author");
        titleButton.setActionCommand("Title");

        authorButton.addActionListener(new ButtonClickListener());
        titleButton.addActionListener(new ButtonClickListener());

        controlPanel.add(authorButton);
        controlPanel.add(titleButton);

        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if(command.equals("Author")){
                statusLabel.setText("Author: René Descartes");
            } else if (command.equals("Title")){
                statusLabel.setText("Cogito Ergo Sum");
            }else {
                statusLabel.setText("None");
            }
        }
    }

}
