import java.util.Scanner;
public class Area {
    public static void main (String [] args) {

//Declaration//
        String PROMPT1= ("Por favor entre la base");
        String PROMPT2= ("Por favor entre la altura");
//Process//

        Scanner sc=new Scanner (System.in);

        System.out.print(PROMPT1);

        int numBase=sc.nextInt() ;

        System.out.print(PROMPT2) ;

        int numAltura=sc.nextInt() ;



        int areaRectangulo= numBase*numAltura;

        System.out.print(areaRectangulo);



        int areaTriangulo= numBase/2*numAltura;
        System.out.print(areaTriangulo);





    }

}