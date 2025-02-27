
import java.util.Scanner;
public class Main {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int figures =sc.nextInt();
        switch (figures) {
            case 1:
                System.out.println(areaDeCirculo());
                break;
            case 2:
                System.out.println(areaDeTriangulo());
                break;
                case 3:
            System.out.println(areaDeQuadrado());
            break;
        }
    }
    public static double areaDeCirculo() {
        System.out.println("Radio: ");
        double radio= sc.nextDouble();
        double area=Math.pow(radio,2)*Math.PI;
        return area;

    }
    public static double areaDeTriangulo() {
        System.out.println("base");
        double base=sc.nextDouble();
        System.out.println("altura");
        double altura=sc.nextDouble();
        double area=base*altura/2;
        return area;

    }
    public static double areaDeQuadrado() {
        System.out.println("base");
        double base=sc.nextDouble();
        System.out.println("altura");
        double altura=sc.nextDouble();
        double area=base*altura;
        return area;

    }
}
