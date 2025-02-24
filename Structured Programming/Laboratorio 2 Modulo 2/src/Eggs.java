import java.util.Scanner;

public class Eggs {
        /*Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $8.50 for a dozen eggs, or 71 cents
        for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of eggs in the
        order and then display the amount owed with a full explanation. For example, typical output might be,
        you ordered 27 eggs. That’s 2 dozen at $8.50 per dozen and 3 loose eggs at 71 cents each for a total of $19.13
        Save the program as Eggs.java.  */
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double dozen = 8.50;
                double eggsPerDozen = 0.71;
                System.out.println("How many packages?");
                double packages = sc.nextInt();
                System.out.println("How many eggs?");
                double eggs = sc.nextInt();
                double looseEggs = eggs*eggsPerDozen;
                double result= packages * dozen;

                if (result%2 == dozen) {
                        result = result + looseEggs;
                    System.out.println("Eggs"+result);
                } else {
                        double singleEggs = result%looseEggs;
                        System.out.printf("Price:"+singleEggs);
                        double eggsPerEgg = singleEggs/eggsPerDozen;
                        System.out.printf("Eggs:"+eggsPerEgg);
                }




        }
}


