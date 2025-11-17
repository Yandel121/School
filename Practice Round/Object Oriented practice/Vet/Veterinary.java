import java.util.Scanner;

public class Veterinary extends Dogs {
    public Veterinary(String name, int age, String breed) {
        super(name, age, breed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a Dog object
        System.out.print ("Enter the name of the dog:");
        String name = sc.nextLine();
        System.out.print ("Enter the age of the dog:");
        int age = sc.nextInt();
        System.out.print ("Enter the breed of the dog:");
        String breed = sc.nextLine();
        sc.close();
        Dogs myDog = new Dogs(name, age,breed);


        System.out.println(myDog.describe());

    }
}
