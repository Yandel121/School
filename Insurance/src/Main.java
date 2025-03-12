import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
/*The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year.
 The premium is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20.
 For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15 and then multiplying by 20.
 Write an application that prompts a user for the current year and a birth year. Pass both to a method that calculates
 and returns the premium amount and then display the returned amount. Save the application as Insurance.java.

Explanation:

Method that calculates...:

This method takes the current year and the birth year to calculate the user's age.
It calculates the decade by dividing the age by 10.
Then, the formula [ _____ + ___ * ___ ] is used to...
Main method:

Prompts the user for the current year and their birth year.
It then calls the method with these inputs.
Finally, it displays the calculated premium.*/
        System.out.println("Welcome to The Harrison Group Life Insurance builiding. How may i help you?");
        double insurance =currentYear();
        double currentPayment = insurance(insurance);
        System.out.println("Here is your current payment you have to pay."+currentPayment);



    }
    public static double insurance(double divideAge) {
        double age=(divideAge+15)*20;
        return age;
    }
    public static double currentYear(){
        System.out.println("Enter the current year: ");
        double yearCurrent=sc.nextDouble();
        System.out.println("Enter your birth year");
        double yearBirth=sc.nextDouble();
        double calculatedAge=yearCurrent-yearBirth;
        double divideAge=calculatedAge/10;
        System.out.println("Current year: "+divideAge);
        return divideAge;


    }
}