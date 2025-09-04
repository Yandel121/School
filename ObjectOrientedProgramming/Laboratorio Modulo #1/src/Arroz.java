import java.util.Scanner;
public class Arroz {
    // File: Arroz.java
    // Author: Yandel Colon Rivera
    // Date: 2025-03-9
    // Class: COMP 2400 OOP
    // Description: Converts pounds into metric tons of rice to tell how many pounds of rice needed for one metric ton.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaration
        double toneladasMetricas = 2204.62262185;

        System.out.println("Ingrese la cantidad de bolsas de arroz: ");

        double arroz = sc.nextDouble();

       double bagsNeeded= Math.ceil(toneladasMetricas/arroz);
       System.out.println("La cantidad de bolsas necesitadas son\n"+bagsNeeded);

            }
        }