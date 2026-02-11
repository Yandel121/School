import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FibonacciProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int a=1;




      for(int i=2;i<=10;i++){
          int b=a+n;

          n=a;
          a=b;
          System.out.println(b);
      }




    }
}