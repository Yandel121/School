import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class potenciaCalculadora {
    public static void main(String[] args) {
      double base,exponente,resultado;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Entra el numero: ");
      base = entrada.nextDouble();
      System.out.println("Entra el exponente: ");
      exponente = entrada.nextDouble();
      resultado = Math.pow(base,exponente);
      System.out.println("Resultado: "+resultado);
        }
    }
