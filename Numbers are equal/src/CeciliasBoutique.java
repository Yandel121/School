import java.util.Scanner;

public class CeciliasBoutique {
    public static void main(String[] args) {
        /*4. Cecilia’s Boutique wants several lists of salesperson data. Design a flowchart or
pseudocode for the following:
a. A program that accepts one salesperson’s ID number, number of items sold
in the last month, and total value of the items and displays data message only
if the salesperson is a high performer—defined as a person who sells more
than 200 items in the month.
b. A program that accepts the salesperson’s data and displays a message only if
the salesperson is a high performer—defined a person who sells more than
200 items worth at least $1,000 in the month.*/

        //Declaration//
        String PROMPT=("Input the ID number");
                String PROMPT2=("Input the number of items sold per day in the last month");
                int idNumber,numitemsSold,totalValue=0;
                int DAYS=30;//Month//

                //Process//
                Scanner sc=new Scanner(System.in);
                System.out.println(PROMPT);
                idNumber=sc.nextInt();
                System.out.println(PROMPT2);
                numitemsSold=sc.nextInt();
                totalValue=numitemsSold*DAYS;

                if (totalValue>=200){
                    System.out.println("You have been selected as employee of the month due to high performance");

                }else {
                    System.out.println("Do better next time :<");
                }

    }
}
