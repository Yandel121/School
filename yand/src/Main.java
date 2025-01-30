import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String city;
    static String state;
    static String zip;
    static String country;

    //Method for the address info
    static Scanner sc = new Scanner(System.in);
        public static void addressInfo(){
            System.out.print("City: ");
            city = sc.nextLine();
            System.out.print("State: ");
            state = sc.nextLine();
            System.out.print("Zip: ");
            zip = sc.nextLine();
            System.out.print("Country: ");
            country = sc.nextLine();
        }
public static void billingFees(){
            double total = 0;
            System.out.print("Enter the total billing fees: ");
            total = sc.nextDouble();
            System.out.print("Enter the total billing amount: ");
            total = sc.nextDouble();
            System.out.print("Enter the total billing amount: ");
            total = sc.nextDouble();
}

        //Metodo principal
        public static void main(String[] args) {
            addressInfo();
          System.out.println("City: " + city);
          System.out.println("State: " + state);
          System.out.println("Zip: " + zip);
          System.out.println("Country: " + country);
        }
        }
