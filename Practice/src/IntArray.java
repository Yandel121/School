import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaration
        int i;
        int [] numbers={12,24,36} ;

        //Process//
        for (i=0; i<numbers.length; i++)
         System.out.println(numbers[i]+"");
         System.out.println();
         for(i=numbers.length-1; i>=0; i--)
             System.out.print(""+numbers[i]+" ");
         System.out.println();

    }
}
