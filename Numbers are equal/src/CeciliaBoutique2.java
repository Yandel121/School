import java.util.Scanner;
public class CeciliaBoutique2 {
    public static void main(String[] args) {


     /*4. Cecilia’s Boutique wants several lists of salesperson data. Design a flowchart or
pseudocode for the following:
b. A program that accepts the salesperson’s data and displays a message only if
the salesperson is a high performer—defined a person who sells more than
200 items worth at least $1,000 in the month.*/

        //Declaration//
        String PROMPT1 = ("Input the ID number");
        String PROMPT2 = ("Input the number of items sold per day in the last month");
        int idNumber, numitemsSold,totalValue= 0;
        int DAYS = 30;//Month//
        int items200= 1000;

        //Process//
        Scanner sc = new Scanner(System.in);
        System.out.println(PROMPT1);
        idNumber= sc.nextInt();
        System.out.println(PROMPT2);
        numitemsSold= sc.nextInt();
        totalValue= numitemsSold*DAYS;
        double productPrice=totalValue*6.50;

        if (productPrice>items200 ){
            System.out.println("Congratulations you are employee of the month");
        } else{
            System.out.println("You are fired :>");
        }
    }
}

