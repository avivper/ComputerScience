package Gmar.Q6;

public class Record {
    public int val;
    public Record next;

    public Record(int v, Record next) {
        val = v;
        this.next = next;
    }

    public int getBiggerOfTwo() {
        return Math.max(this.val, this.next.val);
    }

    public static boolean targR(Record first) {
        if (first == null || first.next == null) {
            return true;
        }
        return ((first.val < first.next.val) && targR(first.next));
    }

    public static boolean targI(Record first) {
        if (first == null || first.next == null) {
            return true;
        } else if (first.val > first.next.val) {
            return false;
        }

        Record traveler = first.next;
        while (traveler != null) {
            if (first.val > first.next.val) {
                return false;
            }
            traveler = traveler.next;
        }
        return true;
    }
}
