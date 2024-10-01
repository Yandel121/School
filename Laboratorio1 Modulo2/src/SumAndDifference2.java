import java.util.Scanner;

public class SumAndDifference2 {
    public static void main(String[] args) {
        // File: SumAndDifference2
        // Author: Yandel Colón
        // Date: 2024-09-30
        // Class: COMP 2120 Programming Logic
        // Description: A program that demonstrates the sum and difference of two values with interactivity.

        //Declaration//
        String PROMPT="Introduzca el valor";
        Scanner sc = new Scanner(System.in);

        //Process//
        System.out.println(PROMPT);
        int num1 = sc.nextInt();
        int result= num1-10;
        int result2= num1+10;
        System.out.println("El resultado es: " + result);
        System.out.println("El resultado es:"+ result2);
        System.out.println(result);
        System.out.println(result2);
    }
}
