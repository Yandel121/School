import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        // File: Reverse.java
        // Author: Yandel Colón Rivera
        // Date: 2024-12-02
        // Class: COMP 2120 Programming Logic
        // Description: A program that put the numbers introduced in reverse

            //Declaration
            int[] numbers = new int[20];

            System.out.println("Please enter 20 numbers:");
            for (int i = 0; i < 20; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("The numbers in reverse order are:");
            for (int i = 19; i >= 0; i--) {
                System.out.println(numbers[i]);
            }

            scanner.close();
        }
    }

