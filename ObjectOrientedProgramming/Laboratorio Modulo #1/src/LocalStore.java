import java.util.Scanner;

public class LocalStore {
    // File: LocalStore.java
    // Author: Yandel Colon Rivera
    // Date: 2025-03-9
    // Class: COMP 2400 OOP
    // Description: Calculates the price of a product with the margin of increase in order to get the selling price for profit.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String milk = "1.\tMilk";
        String bread = "2.\tBread";
        String coffee = "3.\tCoffee";
        
        System.out.println("Please select an option:");
        System.out.println(milk);
        System.out.println(bread);
        System.out.println(coffee);
        
        int option = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        
        double originalPrice = 0.0;
        String selectedItem = "";
        
        switch(option) {
            case 1:
                selectedItem = "Milk";
                System.out.println("Please enter the price of " + selectedItem);
                originalPrice = sc.nextDouble();
                break;
            case 2:
                selectedItem = "Bread";
                System.out.println("Please enter the price of " + selectedItem);
                originalPrice = sc.nextDouble();
                break;
            case 3:
                selectedItem = "Coffee";
                System.out.println("Please enter the price of " + selectedItem);
                originalPrice = sc.nextDouble();
                break;
            default:
                System.out.println("Invalid option selected!");
                return;
        }
        
        // Fixed markup percentage and tax rate
        double markupPercentage = 20.0;
        double taxRate = 0.06;
        
        double[] results = priceCalculations(originalPrice, markupPercentage, taxRate);
        double sellingPrice = results[0];
        double salesTax = results[1];
        double finalPrice = results[2];
        
        System.out.println("\nPrice Breakdown for " + selectedItem + ":");
        System.out.printf("Original price: $%.2f%n", originalPrice);
        System.out.printf("Markup percentage: %.1f%%%n", markupPercentage);
        System.out.printf("Store's selling price: $%.2f%n", sellingPrice);
        System.out.printf("Tax rate: %.1f%%%n", taxRate * 100);
        System.out.printf("Sales tax: $%.2f%n", salesTax);
        System.out.printf("Final price: $%.2f%n", finalPrice);
        
        sc.close();
    }
    
    public static double[] priceCalculations(double originalPrice, double markupPercentage, double taxRate) {
        double sellingPrice = originalPrice * (1 + markupPercentage/100);
        double salesTax = sellingPrice * taxRate;
        double finalPrice = sellingPrice + salesTax;
        
        return new double[] {sellingPrice, salesTax, finalPrice};
    }
}