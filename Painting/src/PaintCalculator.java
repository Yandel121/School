import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PaintCalculator {
    public static void main(String[] args) {
     /*Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main()
     method that prompts the user for the length, width, and height of a rectangular room. */
        System.out.println("Please tell me the measurement of the wall.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the height of the wall.");
        double altura = input.nextDouble();
        System.out.println("Please enter the width of the wall.");
        double ancho=input.nextDouble();
        System.out.println("Please enter the lenght  of the wall.");
        double largo = input.nextDouble();
        double wallArea=paintWallRoom(altura,ancho,largo);
        double gallonsNeeded=paintNeeded(wallArea);
        double price=paintprice(gallonsNeeded);

        System.out.printf("Number of gallons of paint needed: %.2f%n", gallonsNeeded);
        System.out.printf("Total price for the paint: $%.2f%n", price);
    }
    public static double paintWallRoom(double altura, double ancho, double largo) {
        double wallArea = 2 * (altura * largo + altura * ancho);
        System.out.println("Calculated Wall Area: " + wallArea);
        return wallArea;
    }


    public static double paintNeeded(double wallArea){
        double gallonPaint= 350;
        return wallArea/gallonPaint;
    }
    public static double paintprice(double gallonsNeeded) {
        final double PRICE_PER_GALLON = 32; // Price per gallon
        return gallonsNeeded * PRICE_PER_GALLON;
    }
}
