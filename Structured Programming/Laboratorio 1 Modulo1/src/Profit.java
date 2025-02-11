import java.util.Scanner;
public class Profit {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for the sale price and the various costs
            System.out.print("Enter the sale price of the home: ");
            double salePrice = scanner.nextDouble();

            System.out.print("Enter the mortgage payoff amount: ");
            double mortgagePayoff = scanner.nextDouble();

            //Realtor's Commision Fee
            double realtorCommission = 5.32%salePrice;

            //Title Insurance Fee
            double titleInsuranceFee =0.5%salePrice;

            //Transfer Tax
            double transferTax = 0.6%salePrice;

            // Calculate the profit
            double profit = calculateProfit(salePrice, mortgagePayoff, realtorCommission, titleInsuranceFee, transferTax);

            // Display the profit
            System.out.println("The homeowner's profit from the sale is: $" + profit);

            // Close the scanner
            scanner.close();
        }

        public static double calculateProfit(double salePrice, double mortgagePayoff, double realtorCommission, double titleInsuranceFee, double transferTax) {
            // Calculate the profit by deducting the costs from the sale price
            double profit = salePrice - (mortgagePayoff + realtorCommission + titleInsuranceFee + transferTax);
            return profit;
        }
    }

