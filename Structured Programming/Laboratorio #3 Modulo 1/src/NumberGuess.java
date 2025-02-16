import java.util.Scanner;

public class NumberGuess {
        public static void main(String[] args) {
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

