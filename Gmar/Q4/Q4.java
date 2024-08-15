package Gmar.Q4;

public class Q4 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 8, 8, 9, 10, 7};
        boolean[] b = intToBool(a);
        printArray(a);

    }
    public static boolean[] intToBool(int[] a) {
        boolean[] b = new boolean[a.length];
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] + 1 == a[i + 1] && a[i+2] != a[i] + 2) {
                b[i] = true;
            }
        }
        return b;
    }

    public static void printArray (int[] a) {
        boolean[] b = intToBool(a);
        String result = " ";
        for (int i = 0; i < a.length; i++) {
            if (b[i] && (i - 1) >= 0) {
                    result += a[i - 1] + " ";
            } else {
                result += a[i] + " ";
            }
        }
        System.out.println(result);
    }
}
