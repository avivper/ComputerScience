package EpisodeE;

public class E1 {
    public static String getNames() {
        // We are rules!
        return "[6]  סובח + אביב";
    }//0

    public static String stringValueOf(int[] a) {
        String result = String.valueOf(a.length) + " ";
        for (int i = 0; i < a.length; i++) {
            result += a[i] + " ";
        }
        return result;
    }//1

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    } //2

    public static int[] copy(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        return result;
    }  // 3

    public static void swap(int[] a, int i, int j) {
        if (i > a.length && j > a.length) {
            return;
        }
        int tempValue = a[i];
        a[i] = a[j];
        a[j] = tempValue;
    }
    public static int[] reverse(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[a.length - 1 - i] = a[i];
        }
        return result;
    }

    public static void reverseInPlace(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length - 1 - i);
        }
    }
    public static int countJoint (int[] a, int[] b) {
      int count = 0;
        for (int k : a) {
            for (int i : b) {
                if (k == i) {
                    count++;
                }
            }
        }
      return count;
    }
    public static int countGreaterThan (int[] a, int number) {
        int count = 0;
        for (int k : a) {
            if (k > number) {
                count++;
            }
        }
        return count;
    } //8

    public static int[] getGreaterThan (int[] a, int number) {
        int[] result = new int[countGreaterThan(a, number)];
        int counter = 0;
        for (int value : a) {
            if (value > number) {
                result[counter] = value;
                counter++;
            }
        }
        return result;
    }  // 9

    public static int countMinimum (int[] a) {
        int count = 0;
        int minimum = a[a.length - 1];

        for (int i = 0; i < a.length; i++) {
            if (minimum > a[i]) {
                minimum = a[i];
            } if (a[i] == minimum) {
                count++;
            }
        }
        return count;
    }  // 10

    public static int[] subArray (int[] a, int start, int end) {
        if (start > end || end > a.length) {
            return null;
        }
        if (start < 0) {
            start = 0;
        }

        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[start + i];
        }
        return result;

    } //11

    public static boolean sameInSequence (int[] a) {
        int counter = a.length-1;
        while (counter > 0) {
            if (counter == 1) {
                return false;
            }
            if (a[counter] == a[counter - 1] || a[counter] == a[counter - 2]) {
                return true;
            }
            counter--;
        }
        return false;
    }//12

    public static int[] join (int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0 ; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }//13

    public static int[] sumArrays (int[] a, int[] b) {
        int[] result = new int [Math.max(a.length, b.length)];
        for (int i = 0; i < result.length; i++) {
            if (i > b.length-1) {
                result[i] = a[i];
            } else if (i > a.length-1) {
                result[i] = b[i];
            } else {
                result[i] = a[i] + b[i];
            }
        }
        return result;
    }//14

    public static String toStringByOrder (int[] indexes, String[] s) {
        String result = "";
        for (int value : indexes) {
            if (value < s.length) {
                result += s[value] + " ";
            }
        }
        return result;
    } // 15

   public static void main(String[] args) {
       int[] a = {1,2,3,2,5,5};
       String[] b = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
       String c = toStringByOrder(a,b);
       boolean check = sameInSequence(a);
       System.out.println(check);
   }
}
