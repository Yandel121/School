import java.util.Scanner;

public class MileConversionsInteractive {
    public static void main(String[] args) {
        // File: MileConversionsInteractive
        // Author: Yandel Colón
        // Date: 2024-10-07
        // Class: COMP 2120 Programming Logic
        // Description: A program that converts miles into feet,inches and yards.
        //Declaration//
        String PROMPT= ("Introduzca la cantidad de millas deseada");
        double INCHES=63360;
        double FEET= 5280;
        double YARD= 1760;

        Scanner sc = new Scanner(System.in);
        System.out.print(PROMPT);
        double answerMiles = sc.nextDouble();
        double answerFeet= FEET*answerMiles;
        double answerInches= INCHES*answerMiles;
        double answerYards= YARD*answerMiles;

        System.out.println("Feet:\t"+answerFeet);
        System.out.println("Inches:\t"+answerInches);
        System.out.println("Yards:\t"+answerYards);
    }
}
