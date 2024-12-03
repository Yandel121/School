import java.util.Scanner;
public class EvenEntryLoop {
    public static void main(String[] args) {
        // File: EvenEntryLoop.java
        // Author: Yandel Colón Rivera
        // Date: 2024-11-18
        // Class: COMP 2120 Programming Logic
        // Description: An application that asks a user to type an even number displays a message or the sentinel value 999 to stop.
        //When the user types an odd number, display an error message and then returns to input a number once more.

        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Please enter an even number (or 999 to stop):");
            number = sc.nextInt();
            if (number == 999) {
                break;
            } else if (number % 2 == 0) {
                System.out.println("Good job!");
            } else {
                System.out.println("Error: Please enter an even number.");
            }
        }
        System.out.println("Program ended.");
    }
}
