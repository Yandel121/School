import java.util.Scanner;
// File: DemoTees.java
// Author: Yandel Colon Rivera
// Date: 2025-29-9
// Class: COMP 2400 OOP
// Description: Showcases a receipt of the size and color of the chosen T-Shirt. If custom-made, its chosen slogan.
public class DemoTees {
    protected static int max=999;
    protected static int min=1;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        TeeShirt teeShirt= new TeeShirt();
        teeShirt.setOrderNumber((int)(Math.random()*(max-min+1))+1);
        System.out.println("Which size would you like?");
        teeShirt.setSize(sc.nextLine());
        System.out.println("What color would you like?");
        teeShirt.setColor(sc.nextLine());
        teeShirt.printTeeShirt();

        Custom_T_Shirt customTShirt= new Custom_T_Shirt();
        customTShirt.setOrderNumber((int)(Math.random()*(max-min+1))+1);
        System.out.println("Which size would you like?");
        customTShirt.setSize(sc.nextLine());
        System.out.println("What color would you like?");
        customTShirt.setColor(sc.nextLine());
        System.out.println("Enter your slogan");
        customTShirt.setSlogan(sc.nextLine());
        customTShirt.printTeeShirt();
        sc.close();
    }
}
