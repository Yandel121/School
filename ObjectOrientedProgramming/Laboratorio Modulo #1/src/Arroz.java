import java.util.Scanner;

public class Arroz {
    public static void main(String[] args) {
        /*Write a program that prompts the user to input the amount of rice, in pounds, in a bag.
The program outputs the number of bags needed to store one metric ton of rice*/

        Scanner sc = new Scanner(System.in);

        //Declaration
        double toneladasMetricas = 2204.62262185;

        System.out.println("Ingrese la cantidad de libras de arroz en una bolsa: ");

        double arroz = sc.nextDouble();

       double bagsNeeded=toneladasMetricas/arroz;
       System.out.println("La cantidad de bolsas necesitadas son\n"+bagsNeeded);


            }
        }





