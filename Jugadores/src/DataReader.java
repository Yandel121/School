import java.io.*;
// File: DataReader.java
// Author: Yandel Colón Rivera & Ariam Rivas Sánchez
// Date: 2025-04-15
// Class: COMP2315 Structured Programming
// Description: A program that reads the contents of a text file.
public class DataReader {
        public static void main(String[] args) {
            try (BufferedReader br = new BufferedReader(new
                    FileReader("C:\\Users\\yande\\IdeaProjects\\School\\Jugadores\\src\\data.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }



