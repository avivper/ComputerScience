package Gmar.Q12;

public class Sorter {
    public static void sort(int[] a) {
        ezer0(a);
        printArray(a);

        for (int i = 2; i < a.length; i++) {
            ezer1(a, i);
            printArray(a);
        }

    }

    public static void ezer0(int[] a) {
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
            int temp = a[0];
            a[0] = a[min];
            a[min] = temp;
        }
    }

    public static void ezer1(int[] a, int i) {
        int x = a[i];
        int place = i;
        while (x < a[place-1]) {
            a[place] = a[place-1];
            place--;
            if (place == 0) {
                a[place] = x;
                break;
            }
        }
        a[place] = x;
    }

    public static void ezer2(int[] a, int i) {
        int x = a[i];
        int left = 0;
        int right = i;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] <= x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        for (int j = i; j > left; j--) {
            a[j] = a[j-1];
        }

        a[left] = x;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Question A: Which output this software will print?
    /*
    20 35 18 8 14 41 3 39
    8 35 20 18 14 41 3 39
    8 20 35 18 14 41 3 39
    8 18 20 35 14 41 3 39
    8 14 18 20 35 41 3 39
    3 8 14 18 20 35 41 39
    3 8 14 18 20 35 39 41
     */

    // Question B: Describe the sort algorithm
    /*
    Firstly, ezer0 switch the min elements to the first place
    but the problem is, it's not by ascending order.
    Secondly, ezer1 uses iteration and sort the elemens by the place
     */

    // Question C: todo: write method that will do the same task as ezer1 using binary search
    // todo: the method will call ezer2. ezer2 will use the iterative approach


}
