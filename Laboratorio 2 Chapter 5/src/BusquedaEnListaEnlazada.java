import java.util.LinkedList;
import java.util.Scanner;

public class BusquedaEnListaEnlazada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<Integer>();

        System.out.println("Ingrese el valor de la lista: ");
        for (int i = 0; i < 5; i++) {
            int valor = sc.nextInt();
            lista.add(valor);
        }


        System.out.println("El valor de la lista es: " + search(lista));

    }
    public static int search(LinkedList<Integer> lista) {
        System.out.println("Ingrese el valor de la lista que desea buscar: ");
       int search =sc.nextInt();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == search) {
                return i;
            }
        }
        return -1;
    }
}
