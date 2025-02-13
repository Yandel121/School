import java.util.Scanner;
public class InchConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion
        System.out.print("Enter an inch: ");
        double inch = sc.nextInt();
System.out.println("Inches converted to feet: "+convertFeet(inch));
System.out.println("Inches converted to yard: "+convertYard(inch));
        }
        //Converts the inches to Feet
     public static double convertFeet(double inch) {
        double feet = inch/12;

        return feet;

    }
    //Converts the inches to yard
    public static double convertYard(double inch) {
        double yard = inch/36;

        return yard;
    }
    }
