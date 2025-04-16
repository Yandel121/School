import java.io.*;
import java.util.Scanner;
// File: Players.java
// Author: Yandel Colón Rivera & Ariam Rivas Sánchez
// Date: 2025-04-15
// Class: COMP2315 Structured Programming
// Description: A program to collect player names and scores, save them in a file, and display the file content.
public class Players {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] puntos = new int[5];

        try {
            File myObj = new File("Players.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created!" + myObj.getName());
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Players.txt"))) {
            for (int i = 0; i < nombre.length; i++) {
                nombre[i] = getValidName(sc); // Using the simplified method
                puntos[i] = getValidScore(sc); // Using the simplified method

                bw.write("Jugador:"+nombre[i] + ",\tPuntaje:" + puntos[i]);
                bw.newLine();
            }
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("File created at: " + new File("Players.txt").getAbsolutePath());
        ReadFile();

    }

    // Method to validate non-empty player names
    public static String getValidName(Scanner sc) {
        String name;
        do {
            System.out.println("Ingrese el nombre (no vacío): ");
            name = sc.next();
        } while (name.isEmpty());
        return name;
    }

    // Method to validate positive player scores
    public static int getValidScore(Scanner sc) {
        int score;
        do {
            System.out.println("Ingrese la puntuación (positiva): ");
            score = sc.nextInt();
        } while (score < 0);
        return score;
    }

    public static void ReadFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("Players.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





