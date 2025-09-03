import java.util.Scanner;

public class Group_Members {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String studentName = "";
       studentInformation(num, studentName);
       System.out.println("Matching results...");
       System.out.println("Number of students: " + GroupMatching(studentName, num));

    }
    public static double [] studentInformation(int num, String studentName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
         num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of the student");
            studentName = sc.nextLine();
        }
        return studentInformation(num,studentName);
    }
    public static double GroupMatching(String studentName, int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the group");
        String groupName = sc.nextLine();
        System.out.println("Matching the students in pairs of two...");
        for (int i = 0; i < num; i++) {



        }
        return studentName.length();
    }
}
