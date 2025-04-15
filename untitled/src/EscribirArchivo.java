import java.io.*;
public class EscribirArchivo {
        public static void main(String[] args) {
            try {
                File myObj = new File("filename.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            try (BufferedWriter bw = new BufferedWriter(new
                    FileWriter("filename.txt"))) {
                bw.write("¡Hola, Mundo!");
                bw.newLine();
                bw.write("Esto es un archivo de texto.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}