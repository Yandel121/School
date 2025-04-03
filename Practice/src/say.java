import java.util.Scanner;
public class say {
    /*Calculadora de promedio con estructura repetitiva Crea un programa en el que el usuario pueda ingresar un conjunto de números
    uno por uno, y el programa calculará el promedio. La entrada de números continuará hasta que el usuario ingrese
    un valor especial (por ejemplo, -1) para indicar que ya no desea agregar más números.
    Utilizar estructuras como while o do-while para manejar la repetición.
Validar que los números ingresados sean positivos (excepto el valor especial de parada).
Calcular el promedio dinámicamente, sin necesidad de almacenar todos los números en una estructura como arrays.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0; // Inicializamos num
        int contador = 0;
        int suma = 0;
        float promedio;

        System.out.print("Introduzca un número positivo (presiona -1 para terminar): ");
        num = sc.nextInt(); // Pedimos la primera entrada

        while (num != -1) { // Mientras no sea el valor de parada (-1)
            if (num >= 0) { // Solo aceptamos números positivos
                suma += num;
                contador++;
            } else {
                System.out.println("Por favor, introduzca un número positivo.");
            }
            System.out.print("Introduzca otro número positivo (presiona -1 para terminar): ");
            num = sc.nextInt(); // Leemos el siguiente número
        }

        if (contador > 0) { // Verificamos que haya al menos un número válido
            promedio = (float) suma / contador; // Calculamos el promedio
            System.out.printf("El promedio de los números ingresados es: %.2f%n", promedio);
        } else {
            System.out.println("No ingresaste ningún número válido.");
        }

        sc.close(); // Cerramos el Scanner
    }
}

