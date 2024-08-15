package Gmar.Q5;

public class SpecialSeries {
    private int first;

    public SpecialSeries(int first) {
        this.first = first;
    }

    public int rfun(int n) {
        if (n == 0) {
            return this.first;
        }
        if ((rfun (n-1)) % 2 == 0) {
            return rfun(n-1) /2;
        }
        return 3 * rfun(n-1) + 1;
    }

    // Question A: Why rfun is so wasteful?

    /*
    For big input for n, there will be StackOverflow error
    The Computer will use a lot of memory due the copies of the method
    */

    /*
     Question B: Write the method
     ifun (f: N-> N) that will return the same values as rfun without recursion
     */

    public int ifun(int n) {
        int result = this.first;
        for (int i = 0; i < n; i++) {
            if (result % 2 == 0) {
                result = result/ 2;
            } else {
                result = 3 * result + 1;
            }
        }
        return result;
    }

    // Question C: Calculate the first 10th values in case first = 3

    /*
    For n = 10, first = 3:
    ifun(10) =
    0: 10
    1: 5
    2: 16
    3: 8
    4: 4
    5: 2
    6: 1
    7: 4
    8: 2
    9: 1
     */

    // Question D: Write getLengthToOne()

    public int getFirstLengthToOne() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (ifun(i) == 1) {
                return i;
            }
        }
        return -1;
    }

    // Question E: Why getFirstLengthToOne() is so wasteful?
    /*
    Because it uses the method "i" times until it found any first that
    the value will be equal to 1. Therefore, the method will use a lot of
    resources from the computer. 
     */
}
