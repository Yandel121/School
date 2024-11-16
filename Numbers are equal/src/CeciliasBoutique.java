import java.util.Scanner;
public class CeciliasBoutique {
    public static void main(String[] args) {
        // File: CeciliaBoutique
        // Author: Yandel Colón
        // Date: 2024-10-22
        // Class: COMP 2120 Programming Logic
        // Description: A program that accept the ID number, number of items sold and total value to define
        // an objective of the company(how many items sold.

        //Declaration//
        String PROMPT=("Input the ID number");
                String PROMPT2=("Input the number of items sold per day in the last month");
                int idNumber,numitemsSold,totalValue=0;
                int DAYS=30;//Month//
                //Process//
                Scanner sc=new Scanner(System.in);
                System.out.println(PROMPT);
                idNumber=sc.nextInt();
                System.out.println(PROMPT2);
                numitemsSold=sc.nextInt();
                totalValue=numitemsSold*DAYS;
                if (totalValue>=200){
                    System.out.println("You have been selected as employee of the month due to high performance");

                }else {
                    System.out.println("Do better next time :<");
                }

    }
}
