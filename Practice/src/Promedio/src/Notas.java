import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaration//
        String PROMPT1 = ("Cuantas notas son?");
        String PROMPT2 = ("Cual fue la puntuaci0n adquirida?");
        int numNotas;
        double total = 0;
        double promedio = 0;


        //Process//
        System.out.println(PROMPT1);
        numNotas = sc.nextInt();
        System.out.println(PROMPT2);
        double[] valores = new double[numNotas];
        for (int counter=0;counter<valores.length;counter++) {
            valores[counter] = sc.nextDouble();
        }
        for (int counter=0;counter<valores.length;counter++) {
            total = total + valores[counter];

        }
        promedio = total / numNotas;
        System.out.println(promedio);


    }
}