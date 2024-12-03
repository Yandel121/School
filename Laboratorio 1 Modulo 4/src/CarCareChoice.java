import java.util.Scanner;
public class CarCareChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // File: CarCareChoice.java
        // Author: Yandel Colón Rivera
        // Date: 2024-12-02
        // Class: COMP 2120 Programming Logic
        // Description: A program that provides an arrange of services of a car and outputs the price of the selected service


        //Declaration
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        String PROMPT1=("Welcome to Cody's Car Care Shop!");
        String PROMPT2=("Available services:");
        String PROMPT3=("Please enter a service: ");

        //Process
        System.out.println(PROMPT1);
        System.out.println(PROMPT2);
        for (String service : services) {
            System.out.println("- " + service);
        }
        System.out.print(PROMPT3);
        String userChoice = scanner.nextLine().toLowerCase();


        boolean validChoice = false;
        for (int i = 0; i < services.length; i++) {
            if (userChoice.equals(services[i])) {
                System.out.println("You selected: " + services[i]);
                System.out.println("The price is: $" + prices[i]);
                validChoice = true;
                break;
            }
        }
        if (!validChoice) {
            System.out.println("Error: Invalid service entered.");
        }
        scanner.close();
    }
}

