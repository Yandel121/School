import java.util.Scanner;

public class Multiplies {
    public static void main(String[] args) {
        // File: Multiples
        // Author: Yandel Colón
        // Date: 2024-09-30
        // Class: COMP 2120 Programming Logic
        // Description: A program that demonstrates a multiplication through interactivity.

        //Declaration//
        String PROMPT = "Introduzca el numero";

        //Process//
        Scanner sc = new Scanner(System.in);
        System.out.print(PROMPT);
        int num1 = sc.nextInt();
        int result= num1*10;
        System.out.println("El resultado es: " + result);
    }
}
