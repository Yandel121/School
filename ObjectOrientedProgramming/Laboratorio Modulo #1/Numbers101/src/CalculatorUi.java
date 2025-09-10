public class CalculatorUi {
    private int a;
    private int b;
    private int c;
    public static void main(String[] args) {

    }
    public CalculatorUi(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int sum() {
        return a + b + c;
    }
    public int sub() {
        return a - b - c;
    }
    public int mult() {
        return a * b * c;
    }
    public int div() {
        return a / b / c;
    }
    public int mod() {
        return a % b % c;
    }
    public int pow() {
        return (int) Math.pow(a, b);
    }

}
