import java.util.Scanner;
import java.util.Stack;
public class StackOverflow {

    public static void main (String [] args ) {
        Stack<Integer> stack;
        Stack<Integer> stack2;
        stack = new Stack<>();
        stack2 = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        //Stack uses a LIFO Order.
        //The stack.pop removes the last element added.
        for(int i=1; i<=3; i++) {
            System.out.println("Stack removes the last element:\n" + stack.pop());
            //The stack.peek shows the element at the top meaning the last to be pushed is the first to be removed.
            System.out.println("Look at the first element at the top of the stack:\n" + stack.peek());
        }

        System.out.println("----------------------------------");

        System.out.println("Verifying Stack 2's data.");
        Scanner sc = new Scanner(System.in);
        if (stack2.isEmpty()) {
            System.out.println("Stack 2 is empty.");


            System.out.println("Enter a number:");
            stack2.push(sc.nextInt());
        }
            System.out.println("Data has been found:"+stack2.peek());
        }




    }

