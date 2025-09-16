import java.util.Scanner;

public class Return_Vowel {
    public static void main(String  [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vowel:");
        char vowel = sc.next().charAt(0);

        boolean result= isVowel(vowel);
        if (isVowel(vowel)) {
            System.out.println(result+"\tVowel");
        } else {
            System.out.println(result+"\tNot Vowel");
        }
    }
    public static boolean isVowel(char vowel) {

        vowel = Character.toLowerCase(vowel);
        return (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u');
    }
}


