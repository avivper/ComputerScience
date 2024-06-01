package Snippets;

public class Recursion {

    // Part of EpisodeC
    // Types of recursions
    public static void PrintLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void printTowerOne(int gova) {  // רקורסיית ראש
        if (gova == 0) {
            return;
        }
        printTowerOne(gova - 1);
        PrintLine(gova);
    }

    public static void printTowerTwo(int gova) { // רקורסיית זנב
        if (gova == 0) {
            return;
        }
        PrintLine(gova);
        printTowerTwo(gova - 1);
    }

    public static void printTowerThree(int gova) {  // לא ראש ולא זנב
        if (gova == 0) {
            return;
        }
        PrintLine(gova);
        printTowerThree(gova - 1);
        PrintLine(gova);
    }

    public static void printTowerFour(int gova) { // רקורסייה דו ראשית
        if (gova == 0) {
            return;
        }
        printTowerFour(gova - 1);
        PrintLine(gova);
        printTowerFour(gova - 1);
    }
}
