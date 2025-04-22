import java.io.*;

public class ShelterRoofers {
    public static void main(String[] args) {
        /*Gimme Shelter Roofers maintains a file of past customers, including a customer number,name, address, date of
        job, and price of job. It also maintains a file of estimates givenfor jobs not yet performed; this file
        contains a customer number, name, address,proposed date of job, and proposed price.
        Each file is in customer number order. Design the logic that merges the two files to produce one combined file
        of all customers,whether past or proposed, with no duplicates; when a customer who has been given anestimate
        is also a past customer, use the proposed data.*/
        String PastCustomers = "C:\\Users\\Yandel1757\\IdeaProjects\\ProgrammingExercisesChap7\\GimmeShelterPastCustomers.txt";
        String Proposal = "C:\\Users\\Yandel1757\\IdeaProjects\\ProgrammingExercisesChap7\\GimmeShelterProposals.txt";
        String outputFile = "C:\\Users\\Yandel1757\\IdeaProjects\\ProgrammingExercisesChap7\\GimmeUnion.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            //read and write
            try (BufferedReader bread = new BufferedReader(new FileReader(Proposal))) {
                String line1;
                while ((line1 = bread.readLine()) != null) {
                    writer.write(line1);
                    writer.newLine();
                }
            }

            try (BufferedReader br = new BufferedReader(new FileReader(PastCustomers))) {
                String line2;
                while ((line2 = br.readLine()) != null) {
                    System.out.println(line2);
                    writer.write(line2);

                }
            }
            System.out.println("Files merged successfully into" + outputFile);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
