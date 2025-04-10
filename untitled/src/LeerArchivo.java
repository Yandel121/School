import java.io.*;
public class LeerArchivo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new
                FileReader("filename.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new
                FileWriter("filename.txt"))) {
            bw.write("Quimbara Cumbara Quimba Quimbamba");
            bw.newLine();
            bw.write("Esto es un archivo de texto.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

