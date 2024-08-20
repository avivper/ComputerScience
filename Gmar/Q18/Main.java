package Gmar.Q18;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Garfield");
        Human h = new Human ("John");
        h.pet = a;
        a.master = h;
    }

    public void findMaster(Human[] humans, Animal a) {
        for (Human h : humans) {
            if (h.pet.name.equals(a.name)) {
                a.master = h;
                return;
            }
        }
    }


    
}
