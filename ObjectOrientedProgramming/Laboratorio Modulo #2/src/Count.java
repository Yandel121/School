import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vowel:");
        String input = sc.nextLine();
        int vowelCount = 0;
        for (char name : input.toCharArray())
            if (isVowel(name)) {
                vowelCount++;
                System.out.println(vowelCount);
            }
    }

    public static boolean isVowel(char name) {
        name = Character.toLowerCase(name);
        return (name == 'a' || name == 'e' || name == 'i' || name == 'o' || name == 'u');
    }
}
