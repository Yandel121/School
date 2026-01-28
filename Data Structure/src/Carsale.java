//File: Carsale.java
//Author: Yandel Colón Rivera
//Date: 28/1/2026
//Class: COMP 2400 OOP
//Description: Application that outputs the amount of cars sold by each employee and its total monthly sale.

import java.util.ArrayList;
import java.util.Scanner;
public class Carsale {
    private static String [] name=new String[10];
    static ArrayList<Integer> cars = new ArrayList<>();
    private static int total;

    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        Carsale main = new Carsale();
        salesperperson();
        main.printSalesperson();

    }
    public Carsale() {

    }
    public static String name(int i){
        return name[i];
    }

    public static int salesperperson(){
        int sales = 0;
        for(int i = 0; i <10; i++){
            System.out.println("Enter Salesperson: ");
            name[i]=input.nextLine();

            System.out.println("Enter number of sales:");
            sales = input.nextInt();

            cars.add(sales);
            total += sales;
            input.nextLine();
        }
        return sales;

    }
    public void printSalesperson(){
        for(int i = 0; i < cars.size(); i++){
            System.out.println(name(i) + ":" + cars.get(i));
        }
        System.out.println("Total cars sold this month:"+total);
    }
}