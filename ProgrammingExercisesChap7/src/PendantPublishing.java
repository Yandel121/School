import java.io.*;
import java.util.*;
public class PendantPublishing {
    public static void main(String[] args) {
        /*Page Turner Publishing edits multivolume manuscripts for many authors. For each volume, they want a label
        that contains the author’s name, the title of the work, and a volume number in the form Volume 9 of 9.
        For example, a set of three volumes requires three labels: Volume 1 of 3, Volume 2 of 3, and Volume 3 of 3.
        Design an application that reads records that contain an author’s name, the title of the work, and the number of
        volumes. The application must read the records until eof is encountered and produce enough labels for each work.*/

        Scanner sc = new Scanner(System.in);
       try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Yandel1757\\IdeaProjects\\ProgrammingExercisesChap7\\PendantPublishing.txt"))){
           String line;
           while ((line=br.readLine()) !=null){
           System.out.println(line);
           }
       } catch (IOException e){
           e.printStackTrace();
       }
        }
    }
