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
public static void surchargeInfo(){
            //Federal Universal Service Charge
    double FUSC= 3.22;
    System.out.println("Surcharge FUSC: " + FUSC);
    // Regulatory Cost Recovery Charge
      double RCRC= 1.61;
      System.out.println("RCRC: " + RCRC);
      //State Acces Fund
    double SAF= 1.93;
    System.out.println("SAF: " + SAF);
    //State Telecom Surcharge
    double STS=2.02;
    System.out.println("STS: " + STS);
    //Total surcharges and other fees
    double SurchargeTotal= STS + FUSC+RCRC+SAF;
    System.out.println("Total: " +SurchargeTotal);

}
public static void  GovernmentFeeInfo(){
            //9-1-1 Service Fee
            double SERVFEE911=0.95;
            System.out.println("ServFEE911: " + SERVFEE911);
            //County Sales Tax
            double CountySalesTax=0.56;
            System.out.println("CountySalesTax: " + CountySalesTax);
            //County Sales Tax Telecom
            double CSTT=0.98;
            System.out.println("CSTT: " + CSTT);
            //State Sales Tax
            double StateTax=0.66;
            System.out.println("StateTax: " + StateTax);
            //State Sales Tax Telecom
            double STATETAXTELECOM=5.38;
            System.out.println("STATETAXTELECOM: " + STATETAXTELECOM);
            double TotalGovFee= SERVFEE911+CountySalesTax+StateTax+STATETAXTELECOM+CSTT;
            System.out.println("TotalGovFee: " + TotalGovFee);
}

public static void PhonePlan(){

}
        //Metodo principal
        public static void main(String[] args) {
            addressInfo();
          System.out.println("City: " + city);
          System.out.println("State: " + state);
          System.out.println("Zip: " + zip);
          System.out.println("Country: " + country);
          surchargeInfo();
          GovernmentFeeInfo();
          PhonePlan();
        }
        }
