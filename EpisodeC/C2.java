package EpisodeC;

public class C2 {
    public static void main(String[] args) {
        System.out.println(rFirstDistinctPlace("gold", "golda"));
    }
    //0
    public static String getNames () {
        return "[5]  אביב +  יהונתן + אווקה";
    }

    //1
    public static String reverseCharsInString (String s) {
        if (s.length() == 0) {
            return s;
        }
        return reverseCharsInString(s.substring(1)) + s.charAt(0);
    }

    //2
    public static boolean isPalindrome (String s) {
        return (s.equals(reverseCharsInString(s)));
    }

    //3
    public static int countCharInString (char c, String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) != c) { // Hello c
            return countCharInString(c, s.substring(1));
        }
        return countCharInString(c, s.substring(1)) + 1;
    }

    // 4
    public static String eliminateCharFromString (char c, String s) {
        if (s.length() == 0) {
            return s;
        }
        if (s.charAt(0) == c) {
            return eliminateCharFromString(c, s.substring(1));
        }
        return s.charAt(0) + eliminateCharFromString(c, s.substring(1));
    }

    //5.1
    public static int iFirstDistinctPlace (String s1, String s2) {
        for (int i = 0; i < s1.length() &&  i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static int rFirstDistinctPlace (String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return -1;
        }

        else if (s1.length() == 0 || s2.length() == 0 || s1.charAt(0) != s2.charAt(0)) {
            return 0;
        }

        int place = rFirstDistinctPlace(s1.substring(1), s2.substring(1));

        if (place == -1) {
            return -1;
        }

        return place + 1;
    }

}
