import java.util.Scanner;
public class Reverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // File: Reverse2.java
        // Author: Yandel Colón Rivera
        // Date: 2024-12-02
        // Class: COMP 2120 Programming Logic
        // Description: A program that put the numbers introduced in reverse and has a sentinel value

        //Declaration
        int[] numbers = new int[20];
        int count = 0;

        //Process
        System.out.println("Please enter up to 20 numbers (enter -1 to stop):");
        while (count < 20) {
            System.out.print("Number " + (count + 1) + ": ");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numbers[count] = num;
            count++;
                }

                System.out.println("The numbers in reverse order are:");
                for (int i = count - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }

                scanner.close();
            }
        }


