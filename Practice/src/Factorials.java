public class Factorials {
    public static void main(String[] args) {
        /*Write an application that displays the factorial for every integer value from 1 to 10. A factorial of a
number is the product of that number multiplied by each positive integer lower than it. For example,
4 factorial is 4 * 3 * 2 * 1, or 24. Save the file as Factorials.java*/

        //Declaration//
        int number = 3;

// Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

