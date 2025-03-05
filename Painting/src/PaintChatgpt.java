import java.util.Scanner;
public class PaintChatgpt {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            // Prompt the user for the dimensions of the room
            System.out.print("Enter the length of the room (in feet): ");
            double length = sc.nextDouble();

            System.out.print("Enter the width of the room (in feet): ");
            double width = sc.nextDouble();

            System.out.print("Enter the height of the room (in feet): ");
            double height = sc.nextDouble();

            // Calculate the wall area
            double wallArea = calculateWallArea(length, width, height);

            // Calculate the number of gallons needed
            double gallonsNeeded = calculateGallonsNeeded(wallArea);

            // Calculate the price
            double price = calculatePrice(gallonsNeeded);

            // Display results
            System.out.printf("Number of gallons of paint needed: %.2f%n", gallonsNeeded);
            System.out.printf("Total price for the paint: $%.2f%n", price);
        }

        // Method to calculate the wall area
        public static double calculateWallArea(double length, double width, double height) {
            // Calculate the total wall area of the room (assumes four walls)
            double wallArea = 2 * (length * height + width * height);
            return wallArea;
        }

        // Method to calculate the number of gallons of paint needed
        public static double calculateGallonsNeeded(double wallArea) {
            final double COVERAGE_PER_GALLON = 350; // Coverage per gallon in square feet
            return wallArea / COVERAGE_PER_GALLON;
        }

        // Method to calculate the price based on the gallons needed
        public static double calculatePrice(double gallonsNeeded) {
            final double PRICE_PER_GALLON = 32; // Price per gallon
            return gallonsNeeded * PRICE_PER_GALLON;
        }
    }

