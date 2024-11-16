import java.util.Scanner;
public class ifelse3numbers {
    public static void main(String[] args) {
        // File: IfElse3Numbers
        // Author: Yandel Colón
        // Date: 2024-10-22
        // Class: COMP 2120 Programming Logic
        // Description: A program that shows which numbers are larger or if its sums are equal to a third number .
        String PROMPT1=("Input the first number");
        String PROMPT2=("Input the second number");
        String PROMPT3=("Input the third number");
        double num1,num2,num3;

        Scanner sc = new Scanner(System.in);
        System.out.print(PROMPT1);
        num1 = sc.nextDouble();
        System.out.print(PROMPT2);
        num2 = sc.nextDouble();
        System.out.print(PROMPT3);
        num3 = sc.nextDouble();


        if (num1>num2) {
            System.out.println("First is larger.");
        } else if (num1<num2) {
            System.out.println("Second is larger.");
        }  else if (num1+num2==num3) {
            System.out.println("Numbers are equal to the third number.");
        }
    }
}
