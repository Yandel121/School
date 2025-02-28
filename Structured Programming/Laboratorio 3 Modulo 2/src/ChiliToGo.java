import java.util.Scanner;
public class ChiliToGo {
    // File: ChiliToGo.java
    // Author: Yandel Colón & Ariam Rivas
    // Date: 2024-02-7
    // Class: COMP 2315 Structured Programming
    // Description: Un programa que solicita al usuario la cantidad de personas(niños y adultos) que consumiran chili en su menu.
    // Luego, este procedera a recibir su recibo con el precio de su compra.

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to The Huntington Boys and Girls Club! What would you like to order?");
        String choice = sc.nextLine();
        double[] orderDetails = menuOrder();
        int adults = (int) orderDetails[0];
        int children = (int) orderDetails[1];
        double sub = orderDetails[2];

        System.out.println("\n==================== RECIBO DE COMPRA ====================");
        System.out.println("Tienda:Huntington Boys and Girls Club Charity");
        System.out.println("Dirección: Calle Principal #123, Carolina");
        System.out.println("Teléfono: (123) 456-7890");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s %10s %10s %10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s %10.2f %10d %10.2f\n", "Chili Meals", 7.00, adults, 7.00 * adults);
        System.out.printf("%-20s %10.2f %10d %10.2f\n", "Chili Meals Kids", 4.00, children, 4.00 * children);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-42s %10.2f\n", "Total:", sub);
        System.out.println("=========================================================");
    }

    public static double[] menuOrder() {
        System.out.print("How many adults?\n");
        int adults = sc.nextInt();
        System.out.print("How many children?\n");
        int children = sc.nextInt();
        double chiliAdult = 7.00 * adults;
        double chiliChildren = 4.00 * children;
        double order = chiliAdult + chiliChildren;
        return new double[] {adults, children, order};
    }
}
