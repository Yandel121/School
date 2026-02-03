import java.util.Scanner;
//File: Factorial.java
//Author: Yandel Colón Rivera
//Date: 2/2/2026
//Class: COMP 2900 Data Structure
//Description: Looks for a numbers factorial.

public class Factorial {
    private int number;
    public Factorial () {

    }
    public boolean checkNumber (int number) {
        if(number < 0) {
            System.out.println("Number must be positive");
            return false;

        }
            System.out.println("Prooceed");
            return true;

    }

    public void setNumber () {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter number: ");
            this.number = sc.nextInt();
         isValid= checkNumber(this.number);
        }
    }

    public int factorial () {
        int  total = 1;
        for (int i = 1; i <=number; i++) {

            total*=i;
        }
        return total;
    }

    public static void main (String[] args) {
        Factorial main = new Factorial();
        main.setNumber();
        System.out.println(main.factorial());
    }

}