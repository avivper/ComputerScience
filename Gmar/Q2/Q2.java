package Gmar.Q2;

public class Q2 {

    public static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void inPlace(int[] a) {
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                index++;
            }
        }

        for (int i = 0; i < a.length/2; i++) {
            a = selectionSort(a, i, 2);
        }
        for (int i = a.length/2; i < a.length; i++) {
            a = selectionSort(a, i, 1);
        }

    }
    public static void separateEvenOdd(int[] a) {
        int[] result = new int[a.length];
        int index = 0;
        for (int k : a) {
            if (k % 2 == 0) {
                int temp = a[index];
                a[index] = a[k];
                a[k] = temp;
                index++;
            }
        }
        for (int i = 0; i < result.length/2; i++) {
            a = selectionSort(result, i, 2);
        }
        for (int i = a.length/2; i < a.length; i++) {
            a = selectionSort(result, i, 1);
        }
    }

    public static int[] selectionSort(int[] a, int i, int even) {
        int minIndex = i;
        for (int j = i+1; j < a.length; j++) {
            if (a[j] < a[minIndex] && a[j] % even == 0) {
                minIndex = j;
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 4, 10, 11, 13, 20};
        inPlace(a);
        // separateEvenOdd(a);
    }
}
