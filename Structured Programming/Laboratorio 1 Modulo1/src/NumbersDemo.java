import java.util.Scanner;
public class NumbersDemo {
    // File: NumbersDemo.java
    // Author: Yandel Colón Rivera
    // Date: 2025-2-11
    // Class: COMP 2315 Structured Programming
    // Description: A program that  displays various calculations based on the input of 2 mathematical expressions.

        public static void displayTwiceTheNumber(int number) {
            int result = number * 2;
            System.out.println("Twice the number " + number + " is: " + result);
        }

        public static void displayNumberPlusFive(int number) {
            int result = number + 5;
            System.out.println("The number " + number + " plus five is: " + result);
        }

        public static void displayNumberSquared(int number) {
            int result = number * number;
            System.out.println("The number " + number + " squared is: " + result);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integer values
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Call the methods to display the results
        displayTwiceTheNumber(firstNumber);
        displayTwiceTheNumber(secondNumber);

        displayNumberPlusFive(firstNumber);
        displayNumberPlusFive(secondNumber);

        displayNumberSquared(firstNumber);
        displayNumberSquared(secondNumber);


    }
}


