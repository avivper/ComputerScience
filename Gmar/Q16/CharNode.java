package Gmar.Q16;

public class CharNode {
    public CharNode next;
    public char ot;

    public static void replaceCharR(CharNode first, char c1, char c2) {
        if (first == null) {
            return;
        }
        if (first.ot == c1) {
            first.ot = c2;
        }
        replaceCharR(first.next, c1, c2);
    }

    public static void replaceCharI(CharNode first, char c1, char c2) {
        if (first == null) {
            return;
        }
        CharNode traveler = first;
        while (traveler != null) {
            if (traveler.ot == c1) {
                traveler.ot = c2;
            }
            traveler = traveler.next;
        }
    }
}
