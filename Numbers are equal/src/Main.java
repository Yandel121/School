import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Design a flowchart or pseudocode for a program that accepts two numbers from a user and displays one of the
        following messages: first is larger,second is larger, number*/
        //Declaration//
        String PROMPT1=("Input the first number");
        String PROMPT2=("Input the second number");
        double num1,num2=0;

        Scanner sc = new Scanner(System.in);
        System.out.print(PROMPT1);
        num1 = sc.nextDouble();
         System.out.print(PROMPT2);
         num2 = sc.nextDouble();


        if (num1>num2) {
            System.out.println("First is larger.");
        } else if (num1<num2) {
            System.out.println("Second is larger.");
        }  else {
            System.out.println("Numbers are equal.");
        }
    }
}
