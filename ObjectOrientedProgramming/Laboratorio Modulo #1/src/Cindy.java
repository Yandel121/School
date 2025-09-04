import java.util.Scanner;
public class Cindy {
    // File: Cindy.java
    // Author: Yandel Colon Rivera
    // Date: 2025-03-9
    // Class: COMP 2400 OOP
    // Description: Calculates the ammount invested, gained/lost and the ammount received after selling stocks.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many shares did you buy?");
        double shares = sc.nextDouble();
        System.out.print("For how much did you buy the stocks?");
        double sharePrice = sc.nextDouble();
        System.out.print("For how much did you sell the stocks?");
        double shareSellPrice = sc.nextDouble();
        
        //Calculate total amount
        double purchaseAmount = shares * sharePrice;
        double sellAmount = shares * shareSellPrice;

        //Calculate service charges (1.5% = 0.015)
        double purchaseServiceCharge = 0.015 * purchaseAmount;
        double sellServiceCharge = 0.015 * sellAmount;
        double transaction = purchaseServiceCharge + sellServiceCharge;

        //Amount invested
        double amountInvested = purchaseAmount + purchaseServiceCharge;
        //calculate gain or loss
        double gainOrLoss = sellAmount - purchaseAmount;
        //Calculate final amount received
        double finalAmountReceived = sellAmount - sellServiceCharge;

        System.out.println("The amount invested is: " + amountInvested);
        System.out.println("The total service charges is: " + transaction);
        if(gainOrLoss > 0) {
            System.out.println("The amount gained is: " + gainOrLoss);
        } else if(gainOrLoss < 0) {
            System.out.println("The amount lost is: " + gainOrLoss);
        }
        System.out.println("The final amount received is: " + finalAmountReceived);
    }
}