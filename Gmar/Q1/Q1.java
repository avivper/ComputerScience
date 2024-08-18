package Gmar.Q1;

public class Q1 {
    public static int targil(int m, int n) { // f: U -> N
        // U = N^2 - {(m,n) | m = 0 v n = 0}
        if ((m == 1) || (n == 1)) {
            return 1;
        } if (m < n) {
            return targil(m, m);
        } if (m == n) {
            return (1 + targil(m, n - 1));
        }
        return (targil(m, n-1) + targil(m-n, n));
    }
    public static void main(String[] args) {
        int n = targil(2,3);
        System.out.println(n);

    }
    // Question A: what is the f of m,n?
    // Answer:
    /*
    f(m,n) = { f(m,m) if n > m
             { 1 + f(m,n-1) if m == n
             { f(m,n-1) + f(m-n,n) otherwise
             { 1 if m == 1 v n == 1
     */

    // Question B: Calculate f(5,5) and f(4,3)
    /*
    f(4,3):
    f(4,3) = f(4,2) + f(1,3) = 4
    f(4,2) = f(4,1) + f(2,2) = 3
    f(2,2) = 1 + f(2,1) = 2
    f(2,1) = 1

    f(5,5):
    f(5,5) = 1 + f(5,4) = 7
    f(5,4) = f(5,3) + f(1,4) = 5 + 1 = 6
    f(5,3) = f(5,2) + f(2,3) = 2 + 3 = 5
    f(5,2) = f(5,1) + f(3,2) = 3


    f(2,3) = f(2,2) =
    f(2,2) = 1 + f(2,1) = 2

    f(3,2) = f(3,1) + f(1,2) = 2
     */
}


