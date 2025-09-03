public class NumbersYay {

    // File: NumbersYay.java
    // Author: Yandel Colon Rivera
    // Date: 2025-09-03
    // Class: COMP 2400 OOP
    // Description: Create  several overloading methods with atleast 4 calculations.
    public static void main(String[] args) {
        int number1=1, number2=2, number3=3;
        double result1 = operation( number1, number2,number3);
        System.out.println(result1);
        double result2 = operation( number1,  number2);
        System.out.println(result2);
        double result3 = operation( number1);
        System.out.println(result3);


    }
    public static double operation(int number1, int number2, int  number3) {
        return number1 + (number2 * number1) + (number3 * number3);
    }
    public static double operation(int number1, int number2) {
        return number1 - number2;
    }
    public static double operation(int number1) {
        return number1*number1;
    }


}
