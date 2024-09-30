import java.util.Scanner;

public class Grosspay {
    public static void main(String[] args) {
     /* nextInt() retrieves input as an int. The prompt could be anything that
        describes the input needed, such as “Please enter the number of hours you
        worked last week.”
        The calculation will require an arithmetic operator, the variable (input, such
        as hours), and a constant (such as rate of pay). For example, grossPay = hours * rate;
        Since a floating-point number, such as type double, contains decimal
        positions, the program might have to convert one data type to another. If the
        arithmetic operation required both a double (such as rate of pay) and an
        int (such as hours worked), the int would be converted to a double
        because it is higher in the order for establishing a unifying data type.*/

        //Declaration//
        String PROMPT1=("Horas trabajadas por el empleado");
        String PROMPT2= ("Cuanto paga a la hora?");

        Scanner sc = new Scanner(System.in);
        System.out.print(PROMPT1);
       double num1= sc.nextDouble();
        System.out.print(PROMPT2);
        double num2 = sc.nextDouble();
        double result = num1*num2;
        System.out.println(result);
    }
}
