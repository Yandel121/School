import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 7, k = 3;
        int ans = josephus(N, k);
        System.out.println(ans);


    }


    public static int josephus(int N, int k) {
        int i = 1, ans = 0;

        while (i <= N) {
            ans = (ans + k) % i;
            i++;
        }
        return ans + 1;
    }
}
