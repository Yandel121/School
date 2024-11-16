import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // File: Ifelse2
        // Author: Yandel Colón
        // Date: 2024-10-22
        // Class: COMP 2120 Programming Logic
        // Description: A program that shows that showcases which number is higher and if its not there equal.

        //Declaration//
        String PROMPT1=("Input the first number");
        String PROMPT2=("Input the second number");
        double num1,num2=0;
        //Process//
        Scanner sc = new Scanner(System.in);
        System.out.print(PROMPT1);
        num1 = sc.nextDouble();
         System.out.print(PROMPT2);
         num2 = sc.nextDouble();
        if (num1>num2) {
            System.out.println("First is larger.");
        } else if (num1<num2) {
            System.out.println("Second is larger.");
        }  else {
            System.out.println("Numbers are equal.");
        }
    }
}
