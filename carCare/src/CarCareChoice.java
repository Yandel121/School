import java.util.Scanner;
public class CarCareChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        String payment;
        String repeat;
        do {
            System.out.println("Enter choice: ");
            System.out.print("1:oil change → $25\n");
            System.out.print("2tire rotation → $22\n");
            System.out.print("3:battery check → $15\n");
            System.out.print("4:brake inspection → $5\n");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("Oil Change? Yes/No");
                    answer = sc.next();
                    if (answer.equals("Yes")) {
                        System.out.println("Confirm payment method: $25");
                        payment = sc.next();
                        if (payment.equals("25")) {
                            System.out.println(payment + "\treceived");
                        }
                    } else {
                        System.out.println("Error! Try again");
                    }
                    break;
                case "2":
                    System.out.println("Tire rotation? Yes/No");
                    answer = sc.next();
                    if (answer.equals("Yes")) {
                        System.out.println("Confirm payment method: $22");
                        payment = sc.next();
                        if (payment.equals("22")) {
                            System.out.println(payment + "\treceived");
                        }
                    } else {
                        System.out.println("Error! Try again");
                    }
                    break;
                case "3":
                    System.out.println("Battery check? Yes/No");
                    answer = sc.next();
                    if (answer.equals("Yes")) {
                        System.out.println("Confirm payment method: $15");
                        payment = sc.next();
                        if (payment.equals("15")) {
                            System.out.println(payment + "\treceived");
                        }
                    } else {
                        System.out.println("Error! Try again");
                    }
                    break;
                case "4":
                    System.out.println("Brake inspection? Yes/No");
                    answer = sc.next();
                    if (answer.equals("Yes")) {
                        System.out.println("Confirm payment method: $5");
                        payment = sc.next();
                        if (payment.equals("5")) {
                            System.out.println(payment + "\treceived");
                        }
                    } else {
                        System.out.println("Error! Try again");
                    }
                    break;
                default:
                    System.out.println("Error! Try again");
                    break;
            }

            System.out.print("Do you want to continue? (Y/N): ");
            repeat = sc.next();
        }while (repeat.equalsIgnoreCase("Yes")); {

        }
    }

}