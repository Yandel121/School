import java.util.Scanner;

public class Athletic {
    public static void main(String[] args) {
        /*Trainers at Tom’s Athletic Club are encouraged to enroll new members.
        Write an application that allows Tom to enter the names of each of his 25 trainers and the number
        of new members each trainer has enrolled this year. Output is the number of trainers who have enrolled 0 to
        5 members, 6 to 12 members, 13 to 20 members, and more than 20 members. Name your program: AthleticClub.java*/
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name of the trainers: ");
    String [] trainers = new String [25];
        for (int i = 0; i <=trainers.length; i++) {
            trainers[i] = sc.next();
        }
        sc.close();
        System.out.println(trainers[0]);
        int [] members = new int [25];

    }
}
