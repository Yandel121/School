import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {

        // File: ElectionStatistics
        // Author: Yandel Colón
        // Date: 2024-10-07
        // Class: COMP 2120 Programming Logic
        // Description: A program that calculates the percentage of votes between 3 political parties.

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
