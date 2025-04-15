//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Nota {
    public static void main(String[] args) {

        String J="Juan";
        String A="Ana";
        String P="Pedro";
        double notesJ[]={8.5,9.0};
        double notesA[]={7.0,7.5};
        double notesP[]={9.0,9.5};
        System.out.printf("%-10s  Nota 1:%5.2f Nota 2:%10.2f\n ",J,notesJ[0],notesJ[1]);
        System.out.printf("%-10s  Nota 1:%5.2f Nota 2:%10.2f\n ",A,notesA[0],notesA[1]);
        System.out.printf("%-10s  Nota 1:%5.2f Nota 2:%10.2f\n ",P,notesP[0],notesP[1]);
    }
}