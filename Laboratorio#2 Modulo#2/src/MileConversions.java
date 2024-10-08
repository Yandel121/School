public class MileConversions {
    public static void main(String[] args) {
        // File: MileConversions
        // Author: Yandel Colón
        // Date: 2024-10-07
        // Class: COMP 2120 Programming Logic
        // Description: A program that converts miles into feet,inches and yards.

        //Declaration//
        double MILES= 10;
        double INCHES=633600;
        double FEET= 52800;
        double YARD= 17600;

        //Process//
        double answerFeet= FEET/MILES;
        double answerInches= YARD/MILES;
        double answerYards= INCHES/MILES;

        System.out.println("Feet:\t"+answerFeet);
        System.out.println("Inches:\t"+answerInches);
        System.out.println("Yards:\t"+answerYards);
    }
}
