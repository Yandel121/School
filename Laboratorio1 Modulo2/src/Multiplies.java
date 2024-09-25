import java.util.Scanner;

public class Multiplies {
    public static void main(String[] args) {
        /*2. Write, compile, and test a class to represent the logic of a program that
        initialize a value in a variable. The program multiplies the value by 10 and
        outputs the result. Save the class as Multiplies.java.*/

        //Declaration//
        String PROMPT = "Introduzca el numero";

        Scanner sc = new Scanner(System.in);
        System.out.print(PROMPT);
        int num1 = sc.nextInt();
        int result= num1*10;
        System.out.println("El resultado es: " + result);
    }




}
