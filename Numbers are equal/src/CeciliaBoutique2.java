import java.util.Scanner;
public class CeciliaBoutique2 {
    public static void main(String[] args) {
        // File: CeciliaBoutique2
        // Author: Yandel Colón
        // Date: 2024-10-22
        // Class: COMP 2120 Programming Logic
        // Description: A program that accept the ID number, number of items sold and total value to define
        // an objective of the company(sold 200 items worth $1000).

        //Declaration//
        String PROMPT1 = ("Input the ID number");
        String PROMPT2 = ("Input the number of items sold per day in the last month");
        int idNumber, numitemsSold,totalValue= 0;
        int DAYS = 30;//Month//
        int items200= 1000;

        //Process//
        Scanner sc = new Scanner(System.in);
        System.out.println(PROMPT1);
        idNumber= sc.nextInt();
        System.out.println(PROMPT2);
        numitemsSold= sc.nextInt();
        totalValue= numitemsSold*DAYS;
        double productPrice=totalValue*6.50;

        if (productPrice>items200 ){
            System.out.println("Congratulations you are employee of the month");
        } else{
            System.out.println("You are fired :>");
        }
    }
}

