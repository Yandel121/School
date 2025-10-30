//File: DemoBlanket.java
//Author: Yandel Colón Rivera
//Date: 10/29/2025
//Class: 2400 OOP
//Description: Displays objects Blanket and Electric_Blanket.
import java.util.Scanner;
public class DemoBlanket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("------Default Blanket--------");
        Blanket blanket = new Blanket();
        System.out.println(blanket);
        System.out.println("---------------------");

        Blanket blanket2 = new Blanket();
        System.out.println("------Custom Blanket--------");
        System.out.println("Enter QUIT for material to finish");

        do {
            System.out.print("Current details");
            System.out.println(blanket2);
            System.out.print("--------------------");

            //Prompt for material
            System.out.print("Enter Material (Cotton/Wool/Cashmere) or QUIT):");
            input = sc.next();
            if (input.equalsIgnoreCase("QUIT")) {
                break;
            } else {
                blanket2.setMaterial(input);
            }

            System.out.print("Enter size (Twin/Double/Queen/King):");
            blanket2.setSize(sc.next());

            //Prompt for color
            System.out.print("Enter Color: ");
            blanket2.setColor(sc.next());

        } while (true);
        System.out.println("-----------------");
        System.out.println(blanket2);

        Electric_Blanket electricBlanket = new Electric_Blanket();
        System.out.println("------Custom Electric Blanket--------");
        System.out.println("Enter QUIT for material to finish");

        do {
            System.out.print("Current details");
            System.out.println(electricBlanket);
            System.out.print("--------------------");

            //Prompt for material
            System.out.print("Enter Material (Cotton/Wool/Cashmere) or QUIT):");
            input = sc.next();
            if (input.equalsIgnoreCase("QUIT")) {
                break;
            } else {
                electricBlanket.setMaterial(input);
            }

            System.out.print("Enter size (Twin/Double/Queen/King):");
            electricBlanket.setSize(sc.next());

            //Prompt for color
            System.out.print("Enter Color: ");
            electricBlanket.setColor(sc.next());

            System.out.print("Enter Heat Settings (1-5)");
            if (sc.hasNextInt()){
                electricBlanket.setHeatSettings(sc.nextInt());
            }else{
                System.out.println("Invalid input");
                sc.next();
            }

            System.out.println("Automatic Shutoff (Yes/No");
            electricBlanket.setAutomaticShutoff(sc.next());

        } while (true);
        System.out.println("--------Final Electric Blanket---------");
        System.out.println(electricBlanket);

    }
}
