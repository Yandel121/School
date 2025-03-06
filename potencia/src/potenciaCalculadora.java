import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class potenciaCalculadora {
    public static void main(String[] args) {
      double base, exponente, resultado;
      String response;
      Scanner entrada = new Scanner(System.in);
      do{
        System.out.println("Entra el numero: ");
        base = entrada.nextDouble();
        System.out.println("Entra el exponente: ");
        exponente = entrada.nextDouble();
        JOptionPane.showInputDialog(null, "Entra el numero:"+base+"^"+exponente);
        resultado = Math.pow(base, exponente);
//El programa analiza la respuesta, si este esta correcto o no
        //Decision para repetir el programa
        response = JOptionPane.showInputDialog("Deseas repetir el programa?(Si o No)");
      }while(response.equalsIgnoreCase("Si"));
      JOptionPane.showMessageDialog(null,"Adios");
      }
    }

