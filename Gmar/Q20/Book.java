package Gmar.Q20;

public class Book {
    private String title;
    private boolean isLent;
    private Reader reader;

    public Book(String title) {
        this.title = title;
    }

    public void changeLentStatus() {
        if (this.isLent) {
            this.isLent = false;
        } else {
            this.isLent = true;
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean IsLent() {
        return isLent;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader (Reader reader) {
        this.reader = reader;
    }
}
