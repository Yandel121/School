import java.util.Scanner;
// File: BabyNameComparison.java
// Author: Yandel Colon & Ariam Rivas
//Date: 2025-03-20
// Class: COMP 2315 Structured Programming
// Description: A program that creates a variation of two-name combinations based on the input of the user.
public class BabyNameComparison {
    public static void main(String[] args) {
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
