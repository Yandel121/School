import java.util.Scanner;
public class DemoCandles extends Candle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Candle candle1 = new Candle();
        System.out.println("What height would you like?");
        candle1.setHeight(sc.nextInt());
        sc.nextLine();
        System.out.println("What color would you like?");
        candle1.setColor(sc.nextLine());
        candle1.printCandle();

        ScentedCandle sc1 = new ScentedCandle();
        System.out.println("What height would you like in inches?");
        sc1.setHeight(sc.nextInt());
        sc.nextLine();
        System.out.println("What color would you like?");
        sc1.setColor(sc.nextLine());
        System.out.println("What scent would you like?");
        System.out.println("Gardenia");
        System.out.println("Lavender");
        System.out.println("Lemon");
        System.out.println("Honey");
        sc1.setScent(sc.nextLine());
        sc1.printCandle();

    }
}
