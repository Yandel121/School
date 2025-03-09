import java.util.Arrays;
import java.util.Scanner;

public class Parasitos {
    public static boolean esNumeroParasito(int num, int multiplicador) {
        int resultado = num * multiplicador;
        char[] digitosnum = String.valueOf(num).toCharArray();
        char[] digitosresultado = String.valueOf(resultado).toCharArray();

        Arrays.sort(digitosnum);
        Arrays.sort(digitosresultado);
        return Arrays.equals(digitosnum, digitosresultado);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el rango mínimo: ");
            int rangoMin = sc.nextInt();

            System.out.print("Ingrese el rango máximo: ");
            int rangoMax = sc.nextInt();

            System.out.print("Ingrese el rango del multiplicador mínimo: ");
            int multiplicadorMin = sc.nextInt();

            System.out.print("Ingrese el rango del multiplicador máximo: ");
            int multiplicadorMax = sc.nextInt();

            System.out.println("\nBuscando números parásitos...");

            boolean found = false;

            for (int num = rangoMin; num <= rangoMax; num++) {
                for (int multiplicador = multiplicadorMin; multiplicador <= multiplicadorMax; multiplicador++) {
                    if (esNumeroParasito(num, multiplicador)) {
                        System.out.println(num + " es un número parásito cuando se multiplica por " + multiplicador);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("No se encontraron números parásitos en el rango especificado.");
            }
        } finally {
            sc.close();
        }
    }
}

