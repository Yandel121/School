//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bruh {
    public static void main(String[] args) {
        sumElementMatrix();


    }

    public static void sumElementMatrix() {
        double[][] matrices = {{0, 1, 2}, {2, 3, 4}, {5, 6, 7}};
        int rows = matrices.length;
        int cols = matrices[0].length;
        double sum = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                sum += matrices[r][c];


            }
        }
        System.out.println(sum + " ");
        double matrix= printMatrix2(matrices, matrices);
    }

    public static void printMatrix1() {
        int[][] matrices2 = {{0, 1, 2}, {2, 3, 4}, {5, 6, 7}};
        int rows = matrices2.length;
        int cols = matrices2[0].length;
        double sum = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                sum += matrices2[r][c];
                System.out.print(matrices2[r][c] + " ");
            }
        }

    }

    public static double printMatrix2(double[][] matrices, double[][] matrices2) {
        double[][] matrix=new double[matrices.length][matrices.length];
        for (int r = 0; r < matrices.length; r++) {
            for (int c = 0; c < matrices.length; c++) {
                matrix[r][c]= matrices[r][c] + matrices2[r][c];
            }
        }
        for (int r = 0; r < matrices.length; r++) {
            for (int c = 0; c < matrices.length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }


        System.out.println();
        return 0.9;
    }
}

