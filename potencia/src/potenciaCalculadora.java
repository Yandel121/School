import java.util.Scanner;

public class potenciaCalculadora {
  public static void main(String[] args) {
    double base, exponente, resultado;
    String response;
    Scanner entrada = new Scanner(System.in);

    do {
      System.out.print("Ingrese el número base: ");
      while (!entrada.hasNextDouble()) {
        System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
        entrada.next(); // Clear invalid input
      }
      base = entrada.nextDouble();

      System.out.print("Ingrese el exponente: ");
      while (!entrada.hasNextDouble()) {
        System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
        entrada.next(); // Clear invalid input
      }
      exponente = entrada.nextDouble();

      resultado = Math.pow(base, exponente);
      System.out.println("Resultado: " + resultado);

      // Consume newline and get the response
      entrada.nextLine();
      System.out.print("¿Deseas repetir el programa? (Sí o No): ");
      response = entrada.nextLine().trim();
    } while (response.equalsIgnoreCase("Si"));

    System.out.println("Adiós");
    entrada.close();
  }
}
