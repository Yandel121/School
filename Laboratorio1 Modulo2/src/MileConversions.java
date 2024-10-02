public class MileConversions {
    public static void main(String[] args) {

        /* Write a program that declares named constants to represent the number of inches, feet, and yards in a mile.
        Also declare a variable to represent a number of miles and assign a value to it. Compute and display, with
        explanatory text, the value in inches, feet, and yards. Save the program as MileConversion.java*/

        //Declaration//
        double MILES= 10;
        double INCHES=633600;
        double FEET= 52800;
        double YARD= 17600;


                double answerFeet= FEET/MILES;
                double answerInches= YARD/MILES;
                double answerYards= INCHES/MILES;

                System.out.println(answerFeet);
                System.out.println(answerInches);
                System.out.println(answerYards);







    }
}
