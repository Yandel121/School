import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Group_Members {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String studentName = "";
        studentInformation(num, studentName);
        System.out.println("Matching results...");



    }

    public static void studentInformation(int num, String studentName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        num = sc.nextInt();
        sc.nextLine();

        ArrayList<String> students = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of the student");
            studentName = sc.nextLine();
            students.add(studentName);
        }
        Collections.shuffle(students);
        System.out.println("\nRandom Pairs:");
        for (int i = 0; i < students.size(); i += 2) {
            if (i + 1 < students.size()) {
                System.out.println("Pair" + ((i / 2) + 1) + ": " + students.get(i) + " and " + students.get(i + 1));
            } else {
                System.out.println("Remaining Student: " + students.get(i));
            }

        }
    }
}