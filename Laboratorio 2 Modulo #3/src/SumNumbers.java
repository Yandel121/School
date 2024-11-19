import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        // File: SumNumbers.java
        // Author: Yandel Colón Rivera
        // Date: 2024-11-18
        // Class: COMP 2120 Programming Logic
        // Description: A program that tells the sum of the numbers used and stops program with a sentinel value.

        int sum = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (enter 999 to stop):");

        while (true) {
            number = sc.nextInt();
            if (number == 999) {
                break;
            }
            sum += number;
        }

        System.out.println("The sum of the numbers entered is: " + sum);
    }
}
