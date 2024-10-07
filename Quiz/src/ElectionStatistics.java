import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {

        /*Write a program that accepts the names of three political parties and the number of votes each
received in the last mayoral election. Display the percentage of the vote each party received.
Save the program as ElectionStatistics.java*/

        //Declaration//
        String PROMPT1=( "Introduzca la cantidad de votos del partido rojo:" ) ;
        String PROMPT2=( "Introduzca la cantidad de votos del partido azul" ) ;
        String PROMPT3=( "Introduzca la cantidad de votos del partido verde" ) ;

        //Process//
        Scanner sc=new Scanner(System.in);
        System.out.println(PROMPT1);
        double voteRed=sc.nextDouble();
        System.out.println(PROMPT2);
        double voteBlue=sc.nextDouble();
        System.out.println(PROMPT3);
        double voteGreen=sc.nextDouble();
        double allVotes= voteRed + voteGreen + voteBlue;
        double voteRedpercentage= (voteRed /allVotes)*100;
        double voteBluepercentage= (voteBlue /allVotes)*100;
        double voteGreenpercentage= (voteGreen /allVotes)*100;
        System.out.println("Voto rojo: "+voteRedpercentage+"Voto azul: "+voteBluepercentage+"Voto Verde: "+voteGreenpercentage);
    }
}
