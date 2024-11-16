import java.util.Scanner;
public class SwitchSelection {
    public static void main(String[] args) {

        //Declaration//
        String PROMPT1=("Please enter the television model number of youre choice");
       String PROMPT2= ("1.Model 100 comes with stereo sound and cost $1000.");
         String PROMPT3=("2.Model 200 comes with all features of model 100, plus Roku TV included: it cost $1200.");
         String PROMPT4=("3.Model 300 comes with all features of model 200 plus 4K, flat screen; it cost $2000.");

         Scanner sc=new Scanner(System.in);
        System.out.println(PROMPT1);
         int choiceModel=sc.nextInt();
        switch(choiceModel) {
            case 1:
                System.out.println(PROMPT2);
                break;
            case 2:
                System.out.println(PROMPT3);
                break;
            case 3:
                System.out.println(PROMPT4);
                break;
            default:
                System.out.println("Sorry, i didn't quite get that. Please try again.");
        }
    }
}

