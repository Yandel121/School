import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // File: Age
        // Author: Yandel Colón
        // Date: 2024-09-30
        // Class: COMP 2120 Programming Logic
        // Description: A program that demonstrates the age of a user via interactivity.

        //Declaration//
        String PROMPT = "Introduce el año actual";
        String PROMPT2 ="Introduzca el año de nacimiento";

        Scanner sc = new Scanner(System.in);
        System.out.println(PROMPT);
        int num1 = sc.nextInt();
        System.out.println(PROMPT2);
        int num2 = sc.nextInt();
        int result=num1-num2;
        System.out.println("El resultado es: "+result);
















    }
}
