package Gmar.Q1;

public class Q1 {
    public static int targil(int m, int n) {
        if ((m == 1) || (n == 1)) {
            return 1;
        } if (m < n) {
            return targil(m, m);
        } if (m == n) {
            return (1 + targil(m, n - 1));
        }
        return (targil(m, n-1) + targil(m, n));
    }
}


