package Gmar.Q9;

public class Q9 {
    public static boolean isLegal(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.equals("") || s.charAt(1) != '+') {
            return false;
        }
        if (s.charAt(1) == '+') {
            return isLegal(s.substring(2));
        }
        return false;
    }
    public static void main(String[] args) {
        boolean isLegal = isLegal("a+b+c+d+e");
        System.out.println(isLegal);
    }
    // a - V
    // a+b - V
    // ab - X
    // a+ba - X
    // a+b+c - V
}
