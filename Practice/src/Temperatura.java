import javax.swing.*;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // File: Temperatura.java
        // Author: Yandel Colón Rivera
        // Date: 2025-01-23
        // Class: COMP 2120 Programming Logic
        // Description: A program that converts Celsius into Fahrenheit.
        Scanner sc = new Scanner(System.in);
        //Declaration
        String PROMPT= ("Inserta la temperatura en grados Celsius");
        String PROMPT2= ("Este será convertido a Fahrenheit");
        System.out.println(PROMPT);
               double Celsius = sc.nextDouble();
               System.out.println(PROMPT2);
        double TmpConversion= Celsius * 1.8 + 32;
        System.out.println("La temperatura de Celsius convertido en Fahrenheit es: " + TmpConversion);


    }
}
