//package searchlist;
import javax.swing.JOptionPane;

public class SearchList {
    public static void main(String[] args) {
       //Declaration//
       String[] deptName={"Accounting","Human Resources", "Sales"};
       String dept;
       int x;

       boolean deptWasFound = false;
       dept= JOptionPane.showInputDialog(null, "Enter a department name");
       for(x=0; x<deptName.length;++x)
           if (dept.equals(deptName[x]))
               deptWasFound = true;
       if (deptWasFound)
           JOptionPane.showMessageDialog(null, "Department was found in the list");
       else
           JOptionPane.showMessageDialog(null, "Department was not found in the list");
    }
}
