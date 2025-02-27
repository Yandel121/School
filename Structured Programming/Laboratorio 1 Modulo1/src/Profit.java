import java.util.Scanner;
public class Profit {
        public static void main(String[] args) {
            // File: Profit.java
            // Author: Yandel Colón Rivera
            // Date: 2025-2-11
            // Class: COMP 2315 Structured Programming
            // Description:Displays a calculation of the payment of the house considering various factors.
            Scanner scanner = new Scanner(System.in);


            // Prompt the user for the sale price and the various costs
            System.out.print("Enter the sale price of the home: ");
            double salePrice = scanner.nextDouble();

            System.out.print("Enter the mortgage payoff amount: ");
            double mortgagePayoff = scanner.nextDouble();

            //Realtor's Commision Fee
            double realtorCommission =salePrice*0.0532;
            System.out.println("The realtor commission $" + realtorCommission);

            //Title Insurance Fee
            double titleInsuranceFee =0.005*salePrice;
            System.out.println("The title insurance fee is $" + titleInsuranceFee);

            //Transfer Tax
            double transferTax = 0.006*salePrice;
            System.out.println("The transfer tax is $" + transferTax);

            // Calculate the profit
            double profit = calculateProfit(salePrice, mortgagePayoff, realtorCommission, titleInsuranceFee, transferTax);

            // Display the profit
            System.out.println("The homeowner's profit from the sale is: $" + profit);

            // Close the scanner
            scanner.close();
        }

        public static double calculateProfit(double salePrice, double mortgagePayoff, double realtorCommission, double titleInsuranceFee, double transferTax) {
            // Calculate the profit by deducting the costs from the sale price
            double profit = salePrice+ realtorCommission + titleInsuranceFee + transferTax - mortgagePayoff ;
            return profit;
        }
    }

