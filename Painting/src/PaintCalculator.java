import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PaintCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
     /*Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main()
     method that prompts the user for the length, width, and height of a rectangular room. */
       double wallRoom=paintWallRoom();
       double Need=paintNeeded(wallRoom);
       System.out.println("The paint neeeded is:"+Need);
       double Volume=roomVolumen(wallRoom,Need);
      double Price= paintprice(paintNeeded(wallRoom));
      System.out.println("The price is:"+Price);

        }
        public static double paintWallRoom(){
        System.out.println("Please tell me the measurement of the wall.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the height of the wall.");
        double largo = input.nextDouble();
        System.out.println("Please enter the width of the wall.");
        double ancho = input.nextDouble();
        double altura=input.nextDouble();
        double area = largo * ancho;
        System.out.println("The area of the wall is:"+area);
        return area;
        }
        public static double roomVolumen(double area, double altura){
        System.out.println("Please tell me the volume of the wall.");
            double volumen = altura*area;
            System.out.println("The volumen is:"+volumen);
            return volumen;
        }
        public static double paintNeeded(double volumen){
            double gallonPaint= 350;
            double gallonNeed= volumen/gallonPaint;
            return gallonNeed;
        }
        public static double paintprice(double gallonNeed){
        double pergallonPrice= 32;
        double gallonprice= gallonNeed*pergallonPrice;

        return gallonprice;
        }
    }
