import java.util.Scanner;

public class potenciaCalculadora {
  public static void main(String[] args) {
    double base, exponente, resultado;
    String response;
    Scanner entrada = new Scanner(System.in);

    do {
      System.out.print("Ingrese el número base: ");
      base = entrada.nextDouble();
      System.out.print("Ingrese el exponente: ");
      exponente = entrada.nextDouble();
      resultado = Math.pow(base, exponente);
      System.out.println("Resultado: " + resultado);

      // Decision para repetir el programa
      System.out.print("¿Deseas repetir el programa? (Sí o No): ");
      response = entrada.next();
    } while (response.equalsIgnoreCase("Sí"));

    System.out.println("Adiós");
    entrada.close();
  }
}
