package Gmar;

import java.util.Arrays;

public class Q7 {
    /*
    7 8 9
    8 9 0
    9 0 0
     */
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{7, 8, 7}, {7, 7, 8}, {7, 8, 7}};
        // printArray(a);
        // sloppingMatrix(a);
    }
}
