import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        /*2. Write a program that allows a user to continuously enter numbers until
        the user enters 999. Display the sum of the numbers entered.
         Save the program as SumNumbers.java*/

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        while (sum!=999){
            sum =sc.nextInt();
            int resultSum = resultSum+sum;
     System.out.println(resultSum);

        }
    }
}
