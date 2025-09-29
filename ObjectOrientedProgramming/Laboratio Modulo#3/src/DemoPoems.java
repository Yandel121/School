import java.util.Scanner;

public class DemoPoems extends Poem {


    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int choice=0;
        do{
        System.out.println("What type of poem do you want to print?");
        System.out.println("1. Plain Poem");
        System.out.println("2. Couplet");
        System.out.println("3. Limerick");
        System.out.println("4. Haiku");
        System.out.println("5. Exit");
        if(input.hasNextInt()) {
             choice = input.nextInt();
        }else{
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        input.nextInt();
        }
    }while (choice <1 || choice>5);
        switch(choice){
            case 1:
                Poem p=new Poem();
                System.out.println("Enter the title of the poem:");
                p.title=System.console().readLine();
                System.out.println("Enter the number of lines:");
                p.lines=Integer.parseInt(System.console().readLine());
                p.printPoem();
                break;
            case 2:
                Couplet c=new Couplet();
                System.out.println("Enter the title of the poem:");
                c.title=System.console().readLine();
                c.printPoem();

                break;
            case 3:
                Limerick l=new Limerick();
                System.out.println("Enter the title of the poem:");
                l.title=System.console().readLine();
                l.printPoem();

                break;
            case 4:
                Haiku h=new Haiku();
                System.out.println("Enter the title of the poem:");
                h.title=System.console().readLine();
                h.printPoem();
                break;
                case 5:
                System.exit(0);
                break;
                default:
        }
    }
}
