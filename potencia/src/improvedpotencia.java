import javax.swing.*;

public class improvedpotencia {
    public static void main(String[] args) {
        double base = 0, exponente =0 , resultado =0;
        String response;

        do {
                base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de base: "));
                exponente = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor del exponente : "));

            resultado = power( base,  exponente);
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

            // Decision para repetir el programa
            response = JOptionPane.showInputDialog("¿Deseas repetir el programa? (Sí o No)");
        } while (response != null && response.equalsIgnoreCase("Sí"));

    }
    public static double power(double base, double exponente) {
        return Math.pow(base, exponente);
    }


}
