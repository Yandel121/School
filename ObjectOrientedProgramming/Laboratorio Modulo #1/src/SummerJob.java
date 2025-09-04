import java.util.Scanner;
public class SummerJob {
    // File: SummerJob.java
    // Author: Yandel Colon Rivera
    // Date: 2025-03-9
    // Class: COMP 2400 OOP
    // Description: Calculates the amount of money made before and after taxes, the expenses made, the saving bond cost money and remaining money.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the pay rate per hour:");
        double payRate = sc.nextDouble();
        
        System.out.println("Enter the number of hours worked per week:");
        double hoursPerWeek = sc.nextDouble();
        double totalHours = hoursPerWeek * 5;
        double incomeBeforeTaxes = totalHours * payRate;
        double taxes = incomeBeforeTaxes * 0.14;
        double trueIncome = incomeBeforeTaxes - taxes;

        double clothesCost = trueIncome * 0.10;
        double schoolSuppliesCost = trueIncome * 0.01;

        double remainingAfterExpenses = trueIncome - (clothesCost + schoolSuppliesCost);
        
        // Calculate savings bonds (25% of remaining money)
        double savingsBondsCost = remainingAfterExpenses * 0.25;
        
        // Parents contribution
        double parentsSpend = savingsBondsCost * 0.50;
        
        // Final remaining money
        double finalRemaining = remainingAfterExpenses - savingsBondsCost;
        
        // Output results
        System.out.printf("Income before taxes: $%.2f%n", incomeBeforeTaxes);
        System.out.printf("Taxes: $%.2f%n", taxes);
        System.out.printf("Income after taxes: $%.2f%n", trueIncome);
        System.out.printf("Clothes cost: $%.2f%n", clothesCost);
        System.out.printf("School supplies cost: $%.2f%n", schoolSuppliesCost);
        System.out.printf("Savings bonds cost: $%.2f%n", savingsBondsCost);
        System.out.printf("Parents' contribution to bonds: $%.2f%n", parentsSpend);
        System.out.printf("Final remaining money: $%.2f%n", finalRemaining);
    }
}