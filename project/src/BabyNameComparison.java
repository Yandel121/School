import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BabyNameComparison {
    public static void main(String[] args) {
        /*Write an application that prompts the user for three first names and concatenates them in every possible
        two-name combination so that new parents can easily compare them to find the most pleasing baby name.
        Save the file as BabyNameComparison.java.*/

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of your first name");
            String name = sc.nextLine();
            System.out.println("Enter the name of your second name ");
            String secondName = sc.nextLine();
            System.out.println("Enter the name of your third name ");
            String thirdName = sc.nextLine();
            String[] Names = {name,secondName,thirdName};
            
            for (int i = 0; i <3; i++) {
                System.out.println(Names[i] + " " + name);
                System.out.println(Names[i] + " " + secondName);
                System.out.println(Names[i] + " " + thirdName);

            }

        }
    }
