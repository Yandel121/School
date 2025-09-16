import java.util.Scanner;
public class Square_root {
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       for (int i=0;i<=25;i++){
           System.out.println(i+":\t Square Root:\t"+squareRoot(i));
       }


    }
    public static double squareRoot(int i){
        return Math.sqrt(i);
    }
}
