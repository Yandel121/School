import java.util.Scanner;
public class ChiliToGo {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Welcome to The Huntington Boys and Girls Club! What would you like to order?");
            String choice = sc.nextLine();
            double sub = menuOrder();
            System.out.println("\n==================== RECIBO DE COMPRA ====================");
            System.out.println("Tienda: Supermercado Selectos");
            System.out.println("Dirección: Calle Principal #123, Carolina");
            System.out.println("Teléfono: (123) 456-7890");
            System.out.println("---------------------------------------------------------");
            System.out.printf("%-20s %10s %10s %10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
            System.out.println("---------------------------------------------------------");
            System.out.printf("%-20s %10s %10s %10.2f\n", "Chili Meals", 7.00, sub / 7.00, sub);
            System.out.println("---------------------------------------------------------");
            System.out.printf("%-42s %10.2f\n", "Total:", sub);
            System.out.println("=========================================================");
        }

        public static double menuOrder() {
            System.out.println();
            System.out.print("How many adults?\n");
            int adults = sc.nextInt();
            System.out.print("How many children?\n");
            int children = sc.nextInt();
            double chiliAdult = 7.00 * adults;
            double chiliChildren = 4.00 * children;
            double order = chiliAdult + chiliChildren;
            System.out.print(order);
            return order;
        }

        public static double calculateTax(double order) {
            double municipal_Tax = 0.05;
            double tax = order * municipal_Tax;
            System.out.printf("%-5.2f %n", tax);
            return tax;
        }
    }

