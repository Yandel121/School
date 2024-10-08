public class InchesToFeet {
    public static void main(String[] args) {
        // File: InchesToFeet
        // Author: Yandel Colón
        // Date: 2024-10-05
        // Class: COMP 2120 Programming Logic
        // Description: A program that converts inches to feet.

        //Declaration//
        int INCHES=26;
        int FEET=1;
        //Process//
        int result1= FEET*INCHES/12;
        int result2=INCHES%12;
        System.out.println("Feet and inches:\t"+result1+"feet\t"+result2+"inches");



    }
}
