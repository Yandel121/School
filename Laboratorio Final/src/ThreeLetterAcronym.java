import java.util.*;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        /*Three-letter acronyms are common  in the business world. For example, in
          Java you use the IDE to write programs used by the JVM that you might send over a
          LAN. Programmers even use the acronym TLA to stand for three-letter acronym. Write
          a program that allows a user to enter three words, and display the appropriate three-letter
          acronym in all uppercase letter. If the user enters more than three words, ignore the extra words.*/
       @SuppressWarnings("resource")
               Scanner sc = new Scanner(System.in);
       System.out.println("Please enter words: ");
       char text;
       StringBuffer sb = new StringBuffer(5);
       for (int i = 0; i < 3; i++) {
           text = sc.next().charAt(0);
           text = Character.toUpperCase(text);
           sb.append(text);
       }
       System.out.println(sb);
    }

}
