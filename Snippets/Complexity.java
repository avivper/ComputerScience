package Snippets;

public class Complexity {
    public static void main(String[] args) {
        // All of here is a instance of time complexity calculations
        int nlogn = nlogn(256);
        int linearN = linearN(256);
        int factorialN = factorialN(3);
        int exponentialN = exponentialN(Integer.MAX_VALUE, 2);
        int polynomialN = polynomialN(Integer.MAX_VALUE, 2);
        System.out.println(polynomialN);
    }

    public static int O1(int n) { // O(1)
        for (int i = 1; i <= 5; i++) {
            System.out.println("It is always will be O(1), Doesn't matter the N");
        }
        return 1;
    }

    public static int linearN(int n) {  // O(n)
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter++;
        }
        return counter;
    }

    public static int nlogn(int n) {  // O(log_n)
        int counter = 0;
        for (int i = 1; i < n; i *= 2) {
            counter++;
        }
        return counter;
    }

    public static int factorialN(int n) {  // O (n!)
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            int loopCounter = 1;
            for (int j = 1; j <= i; j++) {
                loopCounter *= j;
            }
            for (int k = 0; k < loopCounter; k++) {
                counter++;
            }
        }
        return counter;
    }

    public static int exponentialN(int n, int k) {  // O(k^n), k \in R
        int counter = 1;
        for (int i = 1; i < Math.pow(k, n); i++) {
            counter++;
        }
        return counter;
    }

    public static int polynomialN(int n, int k) {  // O(n^k), k \in R
        int counter = 1;
        for (int i = 1; i < Math.pow(n, k); i++) {
            counter++;
        }
        return counter;
    }
}
