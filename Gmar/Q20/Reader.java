package Gmar.Q20;

public class Reader {
    private String name;
    private int numOfBooks = 0;

    public Reader(String name) {
        this.name = name;
    }

    public void addBook() {
        numOfBooks++;
    }

    public void subBook() {
        numOfBooks--;
    }

    public String getName() {
        return name;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }
}
