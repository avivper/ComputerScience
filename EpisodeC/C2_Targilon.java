package EpisodeC;

public class C2_Targilon {
    public static void main(String[] args) {
        System.out.println(betterPower(21, 5));
    }
    public static double betterThanBetterPower3(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double third = betterThanBetterPower3(x, n / 3);
        if (n % 3 == 0) {
            return (third * third * third);
        }
        if (n % 3 == 1) {
            return (third * third * third * x);
        }
        return (third * third * third * x * x);
    }

    public static double betterThanBetterPower4(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double quarter = betterThanBetterPower4(x, n / 4);
        if (n % 4 == 0) {
            return (quarter * quarter * quarter * quarter);
        }
        if (n % 4 == 1) {
            return (quarter * quarter * quarter * x);
        }
        if (n % 4 == 2) {
            return (quarter * quarter * quarter * x * x);
        }
        return (quarter * quarter * quarter * x * x * x);
    }

    public static double betterPower(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = betterPower(x, n / 2);
        if (n % 2 == 0) {
            return (half * half);
        }
        return (half * half * x);
    }
}
