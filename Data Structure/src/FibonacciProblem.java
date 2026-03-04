import java.util.Arrays;
import java.util.Scanner;
//File: FibonacciProblems.java
//Author: Yandel Colón Rivera
//Date: 2/18/2026
//Class: COMP 2900 Data Structure
//Description: An application that demonstrates the fibonacci sequence.

public class FibonacciProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] elements;
        System.out.println("Enter the number of fibonacci numbers you want:");
        n = sc.nextInt();
        elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = fibonacci(i);
        }
        System.out.println(Arrays.toString(elements));

    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }