import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Players {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] puntos = new int[5];

        for (int i = 1; i < nombre.length; i++) {
            System.out.println("Ingrese el nombre: ");
            nombre[i] = sc.next();
            System.out.println("Ingrese la puntuación: ");
            puntos[i] = sc.nextInt();
        }
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
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("Players.txt"))){
        bw.write("Hola");
        bw.newLine();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void ReadFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("players.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





