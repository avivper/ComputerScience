package Gmar.Q15;

import java.math.*;
public class Q15 {
    public static double p(double[] a, int n, double x) {
        double result = 0;
        double count = 0;
        for (int i = 0; i < a.length; i++) {
            count = Math.pow(x, n--);
            result += a[i] * count;
        }
        return result;
    }

    public static double polynomial(double[] a, int n, double x) {
        if (n == 0) {
            return a[n];
        }
        if (n < 0) {
           return -1;
        }
        return x * polynomial(a, n-1,x) + a[n];
    }

    public static void main(String[] args) {
        double[] a = {1,2,4,3};
        double p = p(a, 3, 3);
        double polynomial = polynomial(a, 3, 3);
        System.out.println(polynomial);
        // todo: calculate this: 1*3^3+2*3^2+4*3^1+3 = 27+18+12+3 = 60 - V
    }
}
