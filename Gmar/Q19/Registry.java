package Gmar.Q19;

public class Registry {
    public Family[] families;

    public Registry() {
        families = new Family[1000];
    }

    public void printStatistics() {
        int familyCount = 0;
        int average = 0;
        int numOfBoys = 0;
        int numOfGirls = 0;
        for (int i = 0; i < families.length; i++) {
            if (families[i] != null) {
                familyCount++;
                average = families[i].getBoys() + families[i].getGirls();
                numOfBoys += families[i].getBoys();
                numOfGirls += families[i].getGirls();
            }
        }
        average = average / familyCount;
        int ratio = numOfBoys / numOfGirls;
        System.out.println("Families: " + familyCount);
        System.out.println("Families's siblings Average: " + average);
        System.out.println("Families Ratio: " + ratio);
    }
}
