package EpisodeB;

public class B3 {
    public static void main(String[] args) {
        int c = indexOfStringInString("ol" ,"Hello"); // ollhe
        System.out.println(c);
    }

    //0
    public static String getNames () {
        return ("[4] אביאל + אביב + יהונתן");
    }

    //1
    public static char lastCharInString (String s) {
        if (s.isEmpty()) {
            return 'X';
        }

        return s.charAt(s.length() - 1);
    }

    //2
    public static int countCharInString (char c, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    //3
    public static int lastIndexOfCharInString (char c, String s) {
        return s.lastIndexOf(c);
    }

    //4
    public static boolean isThereCommonChar (String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    //5
    public static String eliminateCharFromString (char c, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                s = s.substring(0, i) + s.substring(i + 1);
                i--; // Adjust the index for checking another char
            }
        }
        return s;
    }

    //6
    public static String eliminateAllCharsFromString (String letters, String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j) == s.charAt(i)) {
                    s = s.substring(0, i) + s.substring(i);
                }
            }
        }
        return s;
    }

    //7
    public static String reverseCharsInString (String s) {
        String NewString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            NewString = NewString + c;
        }
        return NewString;
    }

    // 8
    public static String reverseWordsInString (String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                temp = s.substring(0, i);
                s = s.substring(i);
            }
        }
        s = s + " " + temp;
        return s;
    }

    // 9
    public static int indexOfStringInString(String stringToFind, String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < stringToFind.length(); j++) {
                if (stringToFind.charAt(j) == s.charAt(i)) {

                }
            }
        }
        return -1;
    }

    /*
        public static int indexOfStringInString(String stringToFind, String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < stringToFind.length(); j++) {
                if (stringToFind.charAt(j) == s.charAt(i)) {
                    continue;
                }
            }
        }
        return -1;
    }
     */

    /*
        public static String eliminateAllCharsFromString (String letters, String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j) == s.charAt(i)) {
                    s = s.substring(0, i) + s.substring(i);
                }
            }
        }
        return s;
    }
     */


    /*
    //10
    public static String eliminateStringFromString (String stringToCut, String s){
    }
     */


}
