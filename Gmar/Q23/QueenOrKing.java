package Gmar.Q23;

public class QueenOrKing {
    private String name;
    private QueenOrKing next;
    private QueenOrKing spouse;  // בן או בת הזוג אם יש


    public String getName() {
        return name;
    }

    public QueenOrKing getNext() {
        return next;
    }

    public QueenOrKing getSpouse() {
        return spouse;
    }
}
