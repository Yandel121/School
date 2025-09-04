public class Elapsed_Time {
    // File: Elapsed_Time.java
    // Author: Yandel Colon Rivera
    // Date: 2025-03-9
    // Class: COMP 2400 OOP
    // Description: Converts seconds into hours and minutes (if possible) and viceversa hours and minutes into seconds.
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de horas: ");
        int horas = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de minutos: ");
        int minutos = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de segundos: ");
        int segundos = Integer.parseInt(System.console().readLine());

        // Adjust time if seconds or minutes are 60 or more
        if (segundos >= 60) {
            minutos += segundos / 60;  // Add extra minutes
            segundos = segundos % 60;  // Keep remaining seconds
        }
        
        if (minutos >= 60) {
            horas += minutos / 60;     // Add extra hours
            minutos = minutos % 60;    // Keep remaining minutes
        }

        System.out.println("Tiempo ajustado:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        
        // Calculate total seconds
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        System.out.println("La cantidad total de segundos es: " + totalSegundos);
    }
}