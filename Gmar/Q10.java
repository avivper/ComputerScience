package Gmar;

public class Q10 {
    /*
    todo: recursive
    write a method that will calculate:
    x^n, n=0, 1
    x^n/2*x^n/2 for even n > 0
    x*x^n-1 for odd n > 0
     */
    public static double pow (double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / pow(x, -n);
        }
        if (n % 2 == 0) {
            return pow (x, n / 2) * pow (x, n / 2);
        } else {
            return x * pow (x, n-1);
        }
    }

    public static double powCore(double x, int n) {
        if (n == 0) {
            return 1;
        } if (n % 2 == 0) {
            return pow (x, n / 2) * pow (x, n / 2);
        }
        return x * pow (x, n-1);
    }

    public static double powShell(double x, int n) {
        if (n < 0) {
            return 1 / powShell(x, -n);
        }
        return powCore(x,n);
    }

    public static void main(String[] args) {
        double x = pow (3, Integer.MAX_VALUE);
        System.out.println(x);
    }
}
