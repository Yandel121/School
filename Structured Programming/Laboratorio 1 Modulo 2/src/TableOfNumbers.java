public class TableOfNumbers {
    // File: TableOfNumbers.java
    // Author: Yandel Colón Rivera & Ariam Rivas Sánchez
    // Date: 2025-2-20
    // Class: COMP 2315 Structured Programming
    // Description: A program that shows a table from 1 to ten and showcasing that numbers power by two and square root.
    public static void main(String[] args) {
        tableau();
    }

    public static void tableau() {
        System.out.println("Table of Numbers");
        String NUMBER = "Number:";
        String POWER = "Power:";
        String SQUARE = "Square:";
        System.out.printf("%-20s %-10s %10s%n", NUMBER, POWER, SQUARE);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-20d %-10d %10.2f %n", i, (int) Math.pow(i, 2), Math.sqrt(i));
        }
    }
}
