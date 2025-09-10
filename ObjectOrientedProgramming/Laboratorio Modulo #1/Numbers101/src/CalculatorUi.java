import java.util.Scanner;

// File: CalculatorUi.java
// Author: Yandel Colon Rivera
// Date: 2025-09-10
// Class: COMP 2400 OOP
// Description: Input 3 numbers and outputs all the possible operations.
public class CalculatorUi {

    // The variables for the numbers to be calculated.
    private int a, b, c;

    public CalculatorUi(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * This is a non-static nested class that contains all the calculation logic.
     * It can directly access the private variables of the outer class.
     */
    class CalculatorLogic {

        public int sum() {
            return a + b + c;
        }

        public int sub() {
            return a - b - c;
        }

        public int mult() {
            return a * b * c;
        }

        public double div() {
            if (b == 0 || c == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return (double) a / b / c;
        }

        public int mod() {
            if (b == 0 || c == 0) {
                throw new ArithmeticException("Modulo by zero is not allowed.");
            }
            return a % b % c;
        }

        public int pow() {
            return (int) Math.pow(a, b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Console Calculator!");

        try {
            System.out.print("Enter the first number (a): ");
            int numA = scanner.nextInt();

            System.out.print("Enter the second number (b): ");
            int numB = scanner.nextInt();

            System.out.print("Enter the third number (c): ");
            int numC = scanner.nextInt();

            // Create an instance of the outer class and use the constructor
            // to initialize the numbers.
            CalculatorUi outer = new CalculatorUi(numA, numB, numC);

            // Create an instance of the inner, nested class.
            // This requires an instance of the outer class.
            CalculatorUi.CalculatorLogic logic = outer.new CalculatorLogic();

            System.out.println("\n--- Results ---");
            System.out.println("Sum: " + logic.sum());
            System.out.println("Subtraction: " + logic.sub());
            System.out.println("Multiplication: " + logic.mult());

            // Use try-catch blocks to handle potential exceptions
            try {
                System.out.println("Division: " + logic.div());
            } catch (ArithmeticException e) {
                System.out.println("Division: " + e.getMessage());
            }

            try {
                System.out.println("Modulo: " + logic.mod());
            } catch (ArithmeticException e) {
                System.out.println("Modulo: " + e.getMessage());
            }

            System.out.println("Power: " + logic.pow());

        } catch (Exception e) {
            System.out.println("An error occurred. Please make sure you enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}






