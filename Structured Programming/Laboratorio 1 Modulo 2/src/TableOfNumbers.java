public class TableOfNumbers {
    public static void main(String[] args) {

       tableau();
    }
            public static void tableau() {
        System.out.println("Table of Numbers");
        String NUMBER="Number:";
        String POWER="Power:";
        String SQUARE="Square:";
        System.out.printf("%-20s %-10s %10s",NUMBER,POWER,SQUARE);
                for (int i = 0; i <= 10; i++) {
                    System.out.printf("%-20d %-10d %10d %n", (i), ((int)Math.pow(i, 2)), (int)(Math.sqrt(i)));
                }

            }
        }

