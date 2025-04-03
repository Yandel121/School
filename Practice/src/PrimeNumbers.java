import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
  System.out.println(isPrime(4));
    }
            public static boolean isPrime(int numero) {
                if (numero==0 ||numero== 1||numero==4) {
                return false;
            }
            for (int i = 2; i < numero/2; i++) {
                if (numero%i == 0) {
                    return false;
                }
        } return true;
            }
        }


