import java.util.Scanner;

public class NumberGuess {
        public static void main(String[] args) {
            // File: NumberGuess.java
            // Author: Yandel Colón Rivera & Ariam Rivas Sánchez
            // Date: 2025-2-18
            // Class: COMP 2315 Structured Programming
            // Description:Displays a  calculation of a number which the user must guess.
            Scanner scanner = new Scanner(System.in);
            int lowerBound = 1;
            int upperBound = 100;
            int targetNumber = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
            int guess = 0;

            System.out.println("Guess the number between 1 and 100!");

            while (guess != targetNumber) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                if (guess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number.");
                }
            }
        }
    }

