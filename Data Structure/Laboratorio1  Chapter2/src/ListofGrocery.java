import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListofGrocery {
    String name;
    String price;


    public void GroceryList() {
        List<String> names = new ArrayList<>();
        List<Double> price = new ArrayList<>();

        names.add("Milk");
        names.add("Bread");
        names.add("Cheese");
        names.add("Pepsi");

        price.add(3.93);
        price.add(5.99);
        price.add(2.00);
        price.add(1.99);

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i)+":"+price.get(i));

        }
        double counter=0;
        for (int i = 0; i < price.size(); i++){
            counter+= price.get(i);

        }
        System.out.println("Total price: "+counter);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListofGrocery list = new ListofGrocery();
        list.GroceryList();
    }

}



