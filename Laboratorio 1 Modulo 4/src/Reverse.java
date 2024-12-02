import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            //Declaration
            int[] numbers = new int[20];

            // Prompt the user to enter 20 numbers
            System.out.println("Please enter 20 numbers:");
            for (int i = 0; i < 20; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // Display the numbers in reverse order
            System.out.println("The numbers in reverse order are:");
            for (int i = 19; i >= 0; i--) {
                System.out.println(numbers[i]);
            }

            scanner.close();
        }
    }

