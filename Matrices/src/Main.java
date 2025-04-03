import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double matriz[][] = Matriz();
        printMatrix(matriz);


    }
    public static double[][] Matriz(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra la cantidad de filas en la matriz: ");
        int filas = sc.nextInt();
        System.out.println("Entra la cantidad de columnas en la matriz: ");
        int columnas = sc.nextInt();
        double[][] matrix = new double [filas][columnas];
        for (int f = 0; f < matrix.length; f++) {
            for (int c = 0; c < matrix[f].length; c++) {
                matrix[f][c] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void printMatrix(double[][] matrix) {
        for (int f = 0; f < matrix.length; f++) {
            for (int c = 0; c < matrix[f].length; c++) {
                System.out.print(matrix[f][c] + " ");
            }
            System.out.println();
        }
    }
}