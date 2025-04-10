import java.io.*;
import java.util.Arrays;

public class BusinessUnion {
    public static void main(String[] args) {
        /*2. Geraldine’s Landscaping Service and Gerard’s Lawn Maintenance are merging their businesses and want to
        merge their customer files. Each file contains a customer number, last name, address, and property area in square feet, and each
two files into one file containing all customers. Assume there are no identical customer numbers*/
        GeraldineFile();
        GerardFile();
    }
    public static void GeraldineFile() {
        String [] Attributes1={"Cust.Num","LastName","Address", "property area"};
        String [] CustInfo1 = {"1012", "Figueroa", "Santa Isidra","Fajardo,PR", "00738,"};
        try{
            File myObj = new File("Geraldine's Landscaping CFiles.txt");
            if(myObj.createNewFile()) {
                System.out.println("File Created: " + myObj.getName());
            }else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try (BufferedWriter bw= new BufferedWriter(new FileWriter
                ("Geraldine's Landscaping CFiles.txt"))){
            bw.write(Arrays.toString(Attributes1));
            bw.newLine();
            bw.write(Arrays.toString(CustInfo1));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void GerardFile(){
        String [] Attributes2={"Cust.Num","LastName","Address", "property area"};
        String [] CustInfo2 = {"1000", "Santana", "Santa Isidra","Fajardo,PR", "00738,"};
        try{
            File myObj = new File("Gerard's Lawn CFiles.txt");
            if(myObj.createNewFile()) {
                System.out.println("File Created: " + myObj.getName());
            }else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try (BufferedWriter bw= new BufferedWriter(new FileWriter
                ("Gerard's Lawn CFiles.txt"))){
            bw.write(Arrays.toString(Attributes2));
            bw.newLine();
            bw.write(Arrays.toString(CustInfo2));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
