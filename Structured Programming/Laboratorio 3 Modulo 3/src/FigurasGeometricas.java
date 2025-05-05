import java.util.Scanner;
// File: FigurasGeometricas.java
// Author: Yandel Colon & Ariam Rivas
//Date: 2025-03-17
// Class: COMP 2315 Structured Programming
// Description: A program that outputs various geometric figures: triangles, full rectangle, void rectangle,rhombus
public class FigurasGeometricas {
    public static void main(String[] args) {
        triangulo();
        fullRectangle();
        voidrectangle();
        rhombus();




    }

    public static void triangulo() {
        //Triangulo
        for (int asteriskTree = 1; asteriskTree < 6; asteriskTree++) { //longitud
            for (int asterisk = 0; asterisk < asteriskTree; asterisk++) { //base
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    public static void fullRectangle() {
        //Rectángulo
        for (int rectangle = 0; rectangle <= 4; rectangle++) {
            System.out.println("######################");
        }
        System.out.println("");
    }

    public static void voidrectangle() {
        //Rectángulo

        int rows = 5; // Number of rows
        int columns = 10; // Number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print stars for the border, spaces for the inside
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
        System.out.println("");
    }

    public static void rhombus() {
        //Rombo
        Scanner ingreso = new Scanner(System.in);
        int altura, i, j;
        //Repetir hasta que se ingrese un numero impar
        do {
            System.out.println("Ingrese la altura de la figura: ");
            altura = Integer.parseInt(ingreso.next());
        } while ((altura % 2) != 1); //Mientras el residuo de la altura sea diferente de 1

        //Dibujar la parte superior
        for (i = 1; i <= altura; i = i + 2) {
            for (j = 1; j <= (altura - i) / 2; j++) {
                System.out.print(" ");//Espacios Vacios
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*"); //Dibuja la parte superior
            }
            System.out.println(" ");
        }
        //Dibuja la parte inferior del rombo
        for (i = altura - 2; i >= 1; i = i - 2) {
            for (j = 1; j <= (altura - i) / 2; j++) {
                System.out.print(" "); //Espacios vacios
            }
            for (j = i; j <= i; j++) {
                System.out.print("*");//Dibuja la parte inferior
            }
            System.out.println(" ");
        }
    }
}
