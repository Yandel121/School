//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Matric {
        public static void main(String[] args) {
// Crear una matriz de 2x3 (2 filas y 3 columnas)
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6}
            };
// Acceder a elementos de la matriz
            System.out.println("Elemento en [0][0]: " + matriz[0][0]); // 1
            System.out.println("Elemento en [1][2]: " + matriz[1][2]); // 6
// Recorrer la matriz
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Salto de línea entre filas
            }

// Crear un arreglo tridimensional de 2x2x2
                    int[][][] arreglo = {
                            {{1, 2}, {3, 4}},
                            {{5, 6}, {7, 8}}
                    };
// Acceder a elementos
                    System.out.println("Elemento en [1][0][1]: " + arreglo[1][0][1]); // 6

            String[][] salutation = {
                    {"Mr. ", "Mrs. ", "Ms. "},
                    {"Kumar","Omar","Halal"}
            };

            // Mr. Kumar
            System.out.println(salutation[0][0] + salutation[1][0]);
            // Mrs. Kumar
            System.out.println(salutation[0][1] + salutation[1][0]);
            //Mr. Omar
            System.out.println(salutation[0][0] + salutation[1][1]);
            //Mrs. Halal
            System.out.println(salutation[0][1] + salutation[1][2]);
        }
}


