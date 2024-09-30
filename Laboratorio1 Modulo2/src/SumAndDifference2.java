import java.util.Scanner;

public class SumAndDifference2 {
    public static void main(String[] args) {
 /*3. Write, compile, and test a class to represent the logic of a program that
        initialize two values in variables. The program outputs the sum of and the
        difference between the two values. Save the class as SumAndDifference.java.*/

        //Declaration//
        String PROMPT="Introduzca el valor";
        Scanner sc = new Scanner(System.in);
        System.out.println(PROMPT);
        int num1 = sc.nextInt();
        int result= num1-10;
        int result2= num1+10;
        System.out.println("El resultado es: " + result);
        System.out.println("El resultado es:"+ result2);
        System.out.println(result);
        System.out.println(result2);














    }
}
