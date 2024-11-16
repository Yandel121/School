import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Please enter an even number (or 999 to stop):");
            number = sc.nextInt();

            if (number == 999) {
                break;
            } else if (number % 2 == 0) {
                System.out.println("Good job!");
            } else {
                System.out.println("Error: Please enter an even number.");
            }
        }

        System.out.println("Program ended.");
    }
}
