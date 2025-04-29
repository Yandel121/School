import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CountWords {
    public static void main(String[] args) {
   /*Write an application that counts the words in a String entered by a user.Words are seperated by any
    combination of spaces,periods,commas,semicolons,question marks, exclamation points,or dashes*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Conteo de palabras: ");
        String word = sc.nextLine();
        System.out.println(countWords(word));
    }
    public static int countWords(String word) {
        int count = 0;
        int state= 0;

        //Traverse all characters of the input string
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '\\') {
                count++;
                continue;
            }

            // If the current character is a word character
            if (Character.isLetterOrDigit(word.charAt(i))) {
                //If previous state was OUT, increment word count and change state to IN
                if (state == 0) {
                    count++;
                    state = 1;
                }
            }
            //If the current character is not a word character
            else{
                state = 0;
            }
        }
        return count;
    }
}