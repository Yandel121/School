import java.util.Scanner;
public class ShadyRestroom {
    public static void main(String[]args) {
        // File: ShadyRestRoom
        // Author: Yandel Colón
        // Date: 2024-10-22
        // Class: COMP 2120 Programming Logic
        // Description: A program that shows the price of the different rooms and displays their price.

        //Declaration//
        String PROMPT = ("Choose the following options for your room:");
        String PROMPT2 = ("1.Queen Bed");
        String PROMPT3 = ("2.King Bed");
        String PROMPT4 = ("3.Suite with a king bed and pull-out couch");
        int queenBed = 125;
        int kingBed = 139;
        int suitepullcouch = 165;

        //Process//
        Scanner sc = new Scanner(System.in);
        System.out.println(PROMPT);
        System.out.println(PROMPT2);
        System.out.println(PROMPT3);
        System.out.println(PROMPT4);
        int roomBed = sc.nextInt();
        switch (roomBed) {
            case 1:
                System.out.println("1.Queen Bed:\t$" + queenBed);
                break;
            case 2:
                System.out.println("2.King Bed:\t$" + kingBed);
                break;
            case 3:
                System.out.println("3.A suite with a king bed and pull-out couch:\t$" + suitepullcouch);
                break;
            default:
                System.out.println("Sorry, we dont have this as an option. Your total would be $0.00");
        }
        System.out.print("Confirm your payment? (yes/no):");
        String confirmation= sc.next();
        if (confirmation.equalsIgnoreCase("yes")){
            System.out.println("Payment confirmed. Thank you for choosing us!");
        }  else{
            System.out.println("Payment not confirmed. Please try again.");
        }
    }
}
