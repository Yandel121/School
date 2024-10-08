import java.util.Scanner;

public class MileConversionsInteractive {
    public static void main(String[] args) {

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

        System.out.println(answerFeet);
        System.out.println(answerInches);
        System.out.println(answerYards);
    }
}
