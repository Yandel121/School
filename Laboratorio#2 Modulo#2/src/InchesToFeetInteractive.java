import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        // File: InchesToFeet
        // Author: Yandel Colón
        // Date: 2024-10-05
        // Class: COMP 2120 Programming Logic
        // Description: A program that converts inches to feet.

        //Declaration//
        String PROMPT = ("Write how many inches to convert into feet");

        //Process//
        Scanner sc = new Scanner(System.in);
        System.out.println(PROMPT);
        int inches = sc.nextInt();
        int feet = inches / 12;
        int result= inches%12;
        System.out.println("Feet and inches:\t"+feet+"feet\t"+result+"inches");

        if (result>0) {
            System.out.println("The remaing inches\t"+result);
        } else {
            System.out.println("No remaining inches");
        }
    }
    }
