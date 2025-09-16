import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the fitness center\n How may i help you today?");
        System.out.println("1.Are you a senior citizen?\n Enter your age");
        double age= sc.nextDouble();
        System.out.println("3.How many personal training sessions have you purchasec?");
        System.out.println("Enter the number of training sessions");
        double trainingSessions= sc.nextDouble();
        System.out.println("4.How many years have you been a member?");
        System.out.println("Enter the amount of months you have been a member");
        double membership= sc.nextDouble();
        FitnessCenter fc=new FitnessCenter();
        double cost=fc.calculateFee(trainingSessions, membership, age);
        System.out.println("The cost of your training is: "+cost);
    }

    public double calculateFee( double trainingSessions, double membership, double age){
        double cost=0;
        double membershipFee= 24.99;
        double trainingFee= 12.99*trainingSessions;

        if(age>=65 &&membership>=12 &&trainingSessions>=5){
            cost= 0.30*0.15*trainingSessions*0.20;
        }else if(age>=65 &&membership<12&&trainingSessions>=5) {
            cost = 0.30 * trainingSessions*0.20;
        }else if (age>=65 &&membership>=12&&trainingSessions<5) {
            cost = 0.30 * 0.15;
        }else if(age<65 &&membership>=12&&trainingSessions>=5) {
            cost = 0.15 * trainingSessions * 0.20;
        }else if(age<65 &&membership<12&&trainingSessions>=5){
            cost=trainingSessions*0.20;
        }else if(age<65 &&membership<12&&trainingSessions<5){
            cost=0;
        }
        if(membership>=12 && trainingSessions>=5) {
            cost = cost + membershipFee*membership + trainingFee;
        }
        else if(membership<12 && trainingSessions<5){
            cost = cost +membershipFee+trainingFee;
        }
        else if(membership<=0 && trainingSessions<5){
            cost = cost +trainingFee;
        }
        return cost;
    }
}
