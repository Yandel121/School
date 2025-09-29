import java.util.Scanner;
// File: DemoCandles.java
// Author: Yandel Colon Rivera
// Date: 2025-29-9
// Class: COMP 2400 OOP
// Description: Ask for the size of the candle the user wants and its color. If its a scented candle it ask for the scent it wants.

public class DemoCandles extends Candle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Asks the user for the candle they want
        Candle candle1 = new Candle();
        System.out.println("What height would you like?");
        candle1.setHeight(sc.nextInt());
        sc.nextLine();
        System.out.println("What color would you like?");
        candle1.setColor(sc.nextLine());

        //Outputs the given information with its price
        candle1.printCandle();

        //Seperates statements
        System.out.println();

        //Ask the user for the scented candle they want
        ScentedCandle sc1 = new ScentedCandle();
        System.out.println("What height would you like in inches?");
        sc1.setHeight(sc.nextInt());
        sc.nextLine();
        System.out.println("What color would you like?");
        sc1.setColor(sc.nextLine());
        System.out.println("What scent would you like?");

        //Selection of choices
        System.out.println("Gardenia");
        System.out.println("Lavender");
        System.out.println("Lemon");
        System.out.println("Honey");
        sc1.setScent(sc.nextLine());

        //Outputs a receipt of the scented candle
        sc1.printCandle();

    }
}
