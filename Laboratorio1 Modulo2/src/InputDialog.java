import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {

        String result;
        result= JOptionPane.showInputDialog(null,"What is your name?");
        JOptionPane.showMessageDialog(null,"Hello,"+result);


    }
}
