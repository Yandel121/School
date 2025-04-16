import java.io.*;
import java.util.Scanner;
// File: NameWriter.java
// Author: Yandel Colón Rivera & Ariam Rivas Sánchez
// Date: 2025-04-15
// Class: COMP2315 Structured Programming
// Description: A program that writes and reads the contents of a text file.
public class NameWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new
                FileWriter("C:\\Users\\yande\\IdeaProjects\\School\\Jugadores\\src\\Names.txt"))) {
            System.out.println("Names:");
            while (true) {
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("Fin"))
                    break;
                bw.write(respuesta);
                bw.newLine();
            }
            System.out.println("Nombres guardados exitosamente");
        }catch (IOException e) {
            e.printStackTrace();
            }

            try (BufferedReader br = new BufferedReader(new
                    FileReader("C:\\Users\\yande\\IdeaProjects\\School\\Jugadores\\src\\Names.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

