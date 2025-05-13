import java.util.Scanner;
// File: Athletic.java
// Author: Yandel Colón Rivera & Ariam Rivas Sánchez
// Date: 2025-4-2
// Class: COMP 2315 Structured Programming
// Description:Inputs the names of trainers and the members recruited to demonstrate the number of recruited members
// within differring ranges

public class Athletic {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] trainers = new String[25];
            int[] membersEnrolled = new int[25];

            // Arrays para contar los rangos
            int count0to5 = 0, count6to12 = 0, count13to20 = 0, countMoreThan20 = 0;

            // Entrada de datos
            for (int i = 0; i < trainers.length; i++) {
                System.out.println("Enter the name of trainer " + (i + 1) + ": ");
                trainers[i] = sc.next();
                System.out.println("Enter the number of members enrolled by " + trainers[i] + ": ");
                membersEnrolled[i] = sc.nextInt();

                // Clasificación por rango
                if (membersEnrolled[i] >= 0 && membersEnrolled[i] <= 5) {
                    count0to5++;
                } else if (membersEnrolled[i] >= 6 && membersEnrolled[i] <= 12) {
                    count6to12++;
                } else if (membersEnrolled[i] >= 13 && membersEnrolled[i] <= 20) {
                    count13to20++;
                } else if (membersEnrolled[i] > 20) {
                    countMoreThan20++;
                }
            }

            // Salida de datos
            System.out.println("Trainers who enrolled 0 to 5 members: " + count0to5);
            System.out.println("Trainers who enrolled 6 to 12 members: " + count6to12);
            System.out.println("Trainers who enrolled 13 to 20 members: " + count13to20);
            System.out.println("Trainers who enrolled more than 20 members: " + countMoreThan20);

            sc.close();
        }
    }


