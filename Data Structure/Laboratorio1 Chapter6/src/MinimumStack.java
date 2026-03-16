import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class MinimumStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        try {
            stack.pop();


         }catch(EmptyStackException e){
        System.out.println("Stack is empty");

        }
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.print(stack.peek());
        }
    }
}
