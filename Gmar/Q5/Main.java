package Gmar.Q5;

public class Main {
    public static void main(String[] args) {
        SpecialSeries series = new SpecialSeries(3);
        // int result = series.rfun(10);
        int iResult = series.ifun(10);
        int firstIndex = series.getFirstLengthToOne();

        System.out.print(iResult);
        System.out.println();
        // System.out.println(result);
        System.out.print(firstIndex);
    }
}

/*
    public int rfun(int n) {
        if (n == 0) {
            return this.first;
        }
        if ((rfun (n-1)) % 2 == 0) {
            return rfun(n-1) /2;
        }
        return 3 * rfun(n-1) + 1;
    }

    For n = 1, first = 5
    1: rfun(1) = rfun(0)
    2: rfun(0) = 5
    3: rfun(1) = 5 -> 3 * 5 + 1 = 6
 */