package Gmar.Q23;

public class Dynasty {
    private QueenOrKing head;

    public int numOfMarried() {
        QueenOrKing traveler = this.head;
        if (traveler == null) {
            return 0;
        }
        int numOfMarried = 0;
        while (traveler != null) {
            if (traveler.getSpouse() != null) {
                numOfMarried++;
            }
            traveler = traveler.getNext();
        }
        return numOfMarried;
    }

    public int numOfMarriedR(QueenOrKing traveler) {
        if (traveler == null) {
            return 0;
        }
        if (traveler.getSpouse() != null) {
            return 1 + numOfMarriedR(traveler.getNext());
        }
        return numOfMarriedR(traveler.getNext());
    }

    public void printDynasty() {
        QueenOrKing traveler = this.head;
        if (traveler == null) {
            System.out.println("No Dynasty");
            return;
        }
        while (traveler != null) {
            System.out.print(traveler.getName() + ", ");
            if (traveler.getSpouse() != null) {
                System.out.print(traveler.getSpouse().getName() + ", ");
            }
            traveler = traveler.getNext();
            System.out.println();
        }
    }
}
