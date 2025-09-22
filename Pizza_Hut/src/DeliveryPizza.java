import java.util.Scanner;
public class DeliveryPizza extends Pizza {
    protected String address;
    protected double deliveryFee;
    public DeliveryPizza() {
        super();
        this.address = address;
        this.deliveryFee = deliveryFee;
    }
    public delivery(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Can you tell us your address?");
        this.address = sc.nextLine();

        System.out.print("Your delivery fee is...");


    }
}
