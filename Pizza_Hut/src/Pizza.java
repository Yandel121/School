import java.util.Scanner;

public class Pizza {
    /*Create a class named Pizza with data fields for description (such as sausage
            and onion) and price. Include a constructor that requires arguments for both
    fields and a method to display the data. Create a subclass named DeliveryPizza
    that inherits from Pizza but adds a delivery fee and a delivery address. The
    description, price, and delivery address are required as arguments to the
    constructor. The delivery fee is $3 if the pizza ordered costs more than $15;
    otherwise it is $5. Write an application that instantiates at least two objects of
    each type, and display the values. Save the files as Pizza.java, DeliveryPizza.java,
    and DemoPizzas.java.*/
    protected String topping;
    protected String price;
    protected String name;
    protected String size;
    protected double sausage;
    protected double pepperoni;
    protected double Bacon;
    protected double doubleCheese;

    public Pizza() {
        this.topping = topping;
        this.price = price;
        this.name = name;
        this.size = size;
        this.sausage = 1.25 ;
        this.pepperoni = 2.00;
        this.Bacon = Bacon= 1.75;
        this.doubleCheese = 0.50;

    }
    public void orderPizza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What toppings do you want in your pizza?");
        topping = sc.nextLine();

        if (topping.equals("Double Cheese")) {
            price += price + doubleCheese;
        }
        if (topping.equals("Pepperoni")) {
            price += price + pepperoni;
        }
        if (topping.equals("Bacon")) {
            price += price + Bacon;
        }
        if (topping.equals("Sausage")) {
            price += price + sausage;
        }

        System.out.println("What size is the pizza?");
        size = sc.nextLine();
        if (size.equals("XL")) {
            size += 4.00;
        } else if (size.equals("L")) {
            size += 2.50;
        } else if (size.equals("M")) {
            size += 1.50;
        } else
            size += 0;
        price+= price+size;
    }

}
