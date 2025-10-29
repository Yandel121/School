//File: DemoBlanket.java
//Author: Yandel Colón Rivera
//Date: 10/29/2025
//Class: 2400 OOP
//Description: Displays objects Blanket and Electric_Blanket.
import java.util.Scanner;
public class DemoBlanket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Blanket blanket = new Blanket();
        blanket.printBlanket();
        System.out.println("---------------------");

        Blanket blanket2 = new Blanket();
        System.out.print("In which size do you want the blanket? ");
        System.out.println("1. Double");
        System.out.println("2. Queen");
        System.out.println("3. King");
        System.out.println("4. Twin");
        blanket2.setSize(sc.next());
        System.out.print("What material? ");
        System.out.println("1. Cotton");
        System.out.println("2. Cashmere");
        blanket2.setMaterial(sc.next());
        System.out.print("In which color? ");
        blanket2.setColor(sc.next());
        blanket2.printBlanket();
        System.out.println("-----------------");

        Electric_Blanket electric_blanket = new Electric_Blanket();
        electric_blanket.setHeatSettings(sc.nextInt());
        electric_blanket.setAutomaticShutoff(sc.next());
        electric_blanket.printBlanket();
    }
}
