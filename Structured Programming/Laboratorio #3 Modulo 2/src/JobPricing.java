import java.util.Scanner;
// File: JobPricing.java
// Author: Yandel Colon & Ariam Rivas
//Date: 2025-03-11
// Class: COMP 2315 Structured Programming
// Description: A program that ask for a report of sorts to determine the cost of the work done
public class JobPricing {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Herbert's Home Repair");
        System.out.println(jobName());


    }
    public static String jobName() {
        System.out.println("Enter the name of the job");
        String jobName = sc.nextLine();
        return jobName;
    }
    public static double calculateJobPrice() {
        System.out.println("What are the cost of the materials used in the job?");
        double materialCost = sc.nextDouble();
        System.out.println("How many work hours?");
        int workHours = sc.nextInt()*35;
        System.out.println(workHours);
        System.out.println("Travel Time to the job site?");
        double travelTime = sc.nextInt()*12;
        System.out.println(travelTime);
        double jobCost = materialCost+workHours+travelTime;
        System.out.println("Job cost is $"+jobCost);
        return jobCost;
    }
}
