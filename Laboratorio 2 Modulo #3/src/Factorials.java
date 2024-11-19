public class Factorials {
    public static void main(String[] args) {
        // File: Factorials.java
        // Author: Yandel Colón Rivera
        // Date: 2024-11-18
        // Class: COMP 2120 Programming Logic
        // Description: An application that displays the factorial for every integer value from 1 to 10.

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Factorial of " + i + " is " + factorial(i));
                }
            }

            public static int factorial(int n) {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                return result;
            }
        }


