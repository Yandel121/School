import javax.swing.*;

public class improvedpotencia {
    static   String response;
    public static void main(String[] args) {
        double base = 0, exponente = 0, resultado = 0;


        do {
            base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de base: "));
            exponente = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor del exponente : "));

            resultado = power(base, exponente);
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

            // Decision para repetir el programa
            response = JOptionPane.showInputDialog("¿Deseas repetir el programa? (Sí o No)");
        } while (response != null && response.equalsIgnoreCase("Si"));

    }

    public static double power(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static void absoluteNumber() {
        // Prompt
        do {  double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Entra el numero: "));

        // Module
        double resultadoAbsVal = absolute(num);


        JOptionPane.showMessageDialog(null, resultadoAbsVal);

        response = JOptionPane.showInputDialog("¿Deseas repetir el programa? (Sí o No)");
    } while (response != null && response.equalsIgnoreCase("Si"));
    }

    public static double absolute(double num) {
        return Math.abs(num); //will calculate th
    }
}
