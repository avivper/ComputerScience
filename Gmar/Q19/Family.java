package Gmar.Q19;

public class Family {
    public  String mother, father;
    public Child firstChild;

    public int getBoys() {
        Child traveler = firstChild;
        if (traveler == null) {
            return 0;
        }
        int count = 0;
        while (traveler != null) {
            if (traveler.sex == 'M') {
                count++;
            }
            traveler = traveler.nextChild;
        }
        return count;
    }


    public int getGirls() {
        return getGirls(this.firstChild);
    }

    public int getGirls(Child child) {
        if (child == null) {
            return 0;
        }
        if (child.sex == 'F') {
            return 1 + getGirls(child.nextChild);
        }
        return getGirls(child.nextChild);
    }
}
