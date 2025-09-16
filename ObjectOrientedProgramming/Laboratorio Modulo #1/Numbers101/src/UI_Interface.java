import javax.swing.*;
import java.awt.*;

public class UI_Interface extends JFrame {
    private JTextField numField1, numField2, numField3;
    private JLabel resultLabel;

    public UI_Interface() {
        super("Numbers 101");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 250);
        setLocationRelativeTo(null);

        //Use BorderLayout for the main frame to place things logically
        setLayout(new BorderLayout(10, 10));

        //Create a panel for the input fields in a label.
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));

        numField1 = new JTextField();
        numField2 = new JTextField();
        numField3 = new JTextField();

        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(numField1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(numField2);
        inputPanel.add(new JLabel("Number 3:"));
        inputPanel.add(numField3);

        //Create a panel for the operation buttons
        JPanel buttonPannel = new JPanel(new GridLayout(2, 3, 5, 5));
        buttonPannel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton divButton = new JButton("Divide");
        JButton modButton = new JButton("Modulo");
        JButton powButton = new JButton("Power");


        buttonPannel.add(addButton);
        buttonPannel.add(subButton);
        buttonPannel.add(mulButton);
        buttonPannel.add(divButton);
        buttonPannel.add(modButton);
        buttonPannel.add(powButton);

        //Create a panel for the result label
        JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resultLabel = new JLabel("Result: ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        resultPanel.add(resultLabel);

        //Add action listeners to each button
        addButton.addActionListener(e -> calculate("sum"));
        subButton.addActionListener(e -> calculate("subtract"));
        mulButton.addActionListener(e -> calculate("multiply"));
        divButton.addActionListener(e -> calculate("divide"));
        modButton.addActionListener(e -> calculate("modulo"));
        powButton.addActionListener(e -> calculate("exponent"));

        //Add panels to the main frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPannel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);

        //Make the window visible
        setVisible(true);

    }

    private void calculate(String operation) {
        try {
            //Get the numbers from the text fields.
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int num3 = Integer.parseInt(numField3.getText());

            //Create an instance of the logic class
            CalculatorUi calculator = new CalculatorUi(num1, num2, num3);
            int result = 0;

            //Perform the correct operation based on the button clicked.
            switch (operation.toLowerCase()) {
                case "sum":
                    result = calculator.sum();
                    break;
                case "subtract":
                    result = calculator.sub();
                    break;
                case "multiply":
                    result = calculator.mult();
                    break;
                case "divide":
                    result = calculator.div();
                    break;
                case "modulo":
                    result = calculator.mod();
                    break;
                case "exponent":
                    result = calculator.pow();
                    break;
            }
        } catch (NumberFormatException ex) {
            // Handle cases where the user enters non-integer values.
            resultLabel.setText("Result: Invalid input!");
        } catch (ArithmeticException ex) {
            // Handle cases like division by zero.
            resultLabel.setText("Result: " + ex.getMessage());
        }

        }
    }

