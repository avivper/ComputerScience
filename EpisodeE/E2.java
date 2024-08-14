package EpisodeE;

import java.util.Arrays;

public class E2 extends E1 {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        int[] a = {1,3,7,6};
        int[] b = {0,0,5,7};
        int[]d =  {0,0,0,8};
        int[]e = {0,0,0,0};
        int[][] c = {a,b,d, e};
        int[][] aviv = aviv(5);
        for (int[] ints : aviv) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\n");
            }
        }
    }

    public static boolean aviv(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[][] aviv(int height) {
        int[][] tower = new int[height][height];
        for (int i = 0; i < height; i++) {
            tower[i][0] = i+1;
        }
        return tower;
    }
}
