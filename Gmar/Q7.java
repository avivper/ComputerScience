package Gmar;

import java.util.Arrays;

public class Q7 {
    /*
    מטריצה משופעת:
    בכל אחד מן האלכסונים היורדים מן השורה העליונה שמאלה ולמטה כל השווים שווים, וכן
    בכל אחד מן האלכסונים היורדים מן העמודה הימנית שמאלה ולמטה כל האיברים שווים
     */
    public static void main(String[] args) {
        int[][] a = new int[][]{ // Left Matrix
                {7, 8, 7},
                {7, 7, 8},
                {7, 8, 7}
        };

        int[][] b = new int[][]{  // Middle Matrix
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {6, 5, 1, 2},
        };

        int[][] c = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 0},
        };

        System.out.println(isSlopeMatrix(a) + "\n" +
                isSlopeMatrix(b) + "\n" +
                isSlopeMatrix(c));
    }
    
    /*
    The Method will convert the Middle Matrix b to:
    {1,2,3,4},
    {2,3,4,3},
    {3,4,3,2}
     */

    // Question A
    public static void sloppingMatrix(int[][] a) {
        for (int i = 0; i < a[0].length-1; i++) {
            if (a[0][i]+1 != a[0][i+1]) {
                a[0][i+1] = a[0][i]+1;
            }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                if (a[i][j] != a[i-1][j+1]) {
                    a[i][j] = a[i-1][j+1];
                }
            }
        }
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Question B
    public static boolean isSlopeMatrix(int[][] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i][i]+1 != a[i+1][i]) {
                return false;
            }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                if (a[i][j] != a[i-1][j+1]) {
                    return false;
                }
            }
        }

        return true;

    }
}
