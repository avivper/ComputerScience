package Gmar;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 10, 11, 13, 20};
        // inPlace(a);
        separateEvenOdd(a);
    }
    public static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void separateEvenOdd(int[] a) {
        int[] result = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result[index++] = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                result[index++] = a[i];
            }
        }

        selectionSort(result, 0, result.length/2);
        selectionSort(result, result.length / 2, result.length - 1);

        for (int i = 0; i < result.length; i++) {
            result[i] = a[i];
        }

        printArray(result);
    }

    public static void selectionSort(int[] a, int start, int end) {
        for (int i = start; i <= end; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= end; j++) {
                if (a[i] < a[minIndex]) {
                    minIndex = j;
                }
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
    }
}
