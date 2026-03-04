//File: Josephus.java
//Author: Yandel Colón Rivera
//Date: 2/23/2026
//Class: COMP 2900 Data Structure
//Description: Application that demonstrates the Josephus problem.
public class JosephusProblem {
    public static void main(String[] args) {
        int N = 7, k = 4;
        int ans = josephus(N, k);
        System.out.println("The winner is: "+ans);
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
