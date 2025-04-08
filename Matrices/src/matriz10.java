import java.util.Scanner;
public class matriz10 {
    public static void cargar(int[][] mat, Scanner teclado) {
            System.out.print("Cuantas fila tiene la matriz: ");
            int filas = teclado.nextInt();
            System.out.print("Cuantas columnas tiene la matriz: ");
            int columnas = teclado.nextInt();

            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < columnas; c++) {
                    System.out.print("Ingrese componente: ");
                    mat[f][c] = teclado.nextInt();
                }
            }
        }

        public static void imprimir(int[][] mat, int filas, int columnas) {
            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < columnas; c++) {
                    System.out.print(mat[f][c] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Cuantas fila tiene la matriz: ");
            int filas = teclado.nextInt();
            System.out.print("Cuantas columnas tiene la matriz: ");
            int columnas = teclado.nextInt();

            int[][] mat = new int[filas][columnas];
            cargar(mat, teclado);
            imprimir(mat, filas, columnas);
        }
    }


