package Gmar.Q13;

public class Tar {
    public static int n;

    public static void main(String[] args) {
        n = 4;
        int x = tarI(15);
        System.out.println(x);
    }

    public static int tarR(int x) {
        while (x%n != 0) {
            x--;
        }
        if (x == 0) {
            return 1;
        } else {
            return x * (tarR(x - 1));
        }
    }

    // Question A: What is the output of tarR while x = 15?
    // Answer: 384

    // Question B: There an input that the recursive will be infinite?
    // Answer: No, However, there can be StackOverFlow error if we input high values

    // Question C: Describe the method tarR
    // Answer: calculate the multiplies of the divided numbers of n

    //Question D: todo: Write tarI, the same as tarR.

    public static int tarI(int x) {
        if (x == 0) {
            return 1;
        }
        int result = 1;
        while (x != 0) {
            while (x%n != 0) {
                x--;
            }
            if (x == 0) {
                return result;
            } else {
                result *= x;
                x--;
            }
        }
        return result;
    }
}
