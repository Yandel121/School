import javax.swing.*;
import java.util.Scanner;

public class PotenciaCalculadora {
    public static void main(String[] args) {
        double base, exponente, resultado;
        String response;
        
        do {
            base = getInput("Ingrese el número base: ");
            exponente = getInput("Ingrese el exponente: ");
            resultado = Math.pow(base, exponente);
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

            // Decision para repetir el programa
            response = JOptionPane.showInputDialog("¿Deseas repetir el programa? (Sí o No)");
        } while (response != null && response.equalsIgnoreCase("Sí"));
        
        JOptionPane.showMessageDialog(null, "Adiós");
    }

    private static double getInput(String message) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(message));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }


