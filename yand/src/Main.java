import java.util.Scanner;
public class Main {
    // File: Main.java
    // Author: Yandel Colón Rivera
    // Date: 2025-2-7
    // Class: COMP 2315 Structured Programming
    // Description: A program that through 5 modules executes a phone bill

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
    //Method for surcharge fees
    public static double surchargeInfo(){
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
        return SurchargeTotal;

    }
    public static double  GovernmentFeeInfo(){
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
        return TotalGovFee;
    }

    public static double PhonePlan(){
        String response = "no";
        double planprice = 0;
        while(response.equalsIgnoreCase("no")){
            System.out.print("Enter Phone Plan: (1:Basic plan, 2:Standard plan, 3:Premium plan)  ");
            int plan= sc.nextInt();
            switch (plan) {
                case 1:
                    planprice= 30.00;
                    System.out.println("Basic Plan:500MB data, $30.00/month");
                    break;
                case 2:
                    planprice= 42.56;
                    System.out.println("Standard Plan:2GB data, $42.56/month");
                    break;
                case 3:
                    planprice= 50.99;
                    System.out.println("Premium Plan:10GB data, $50.99/month");
                    break;
                default:
                    System.out.println("Unknown Plan: Please select a valid plan.");
                    System.exit(0);
                    break;
            }
            System.out.println("Is this your chosen phone plan? yes/no");
            response = sc.next();
        }
        return planprice;

    }
    public static double TotalBillPrice( double surcharge, double government, double PlanPhone){
        double billprice = surcharge + government + PlanPhone;
        return billprice;
    }
    //Metodo principal
    public static void main(String[] args) {
        addressInfo();
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
        System.out.println("Country: " + country);
        double surcharge =surchargeInfo();
        double government= GovernmentFeeInfo();
        double PlanPhone= PhonePlan();
        System.out.println("Total"+TotalBillPrice(surcharge, government, PlanPhone));

    }
}