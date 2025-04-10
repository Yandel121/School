import java.io.*;
public class Hijo {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new
                FileReader("Hijo de la luna.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new
                FileWriter("Hijo de la luna.txt"))) {
            bw.write("Hijo de la luna turu turu turu turu turu turu turu turu");
            bw.newLine();
            bw.write("Esto es un archivo de texto.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
