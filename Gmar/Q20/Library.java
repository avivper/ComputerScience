package Gmar.Q20;

import java.util.Objects;

public class Library {
    private Book[] books;
    private Reader[] readers;

    public Library(int booksNum, int readerNum) {
        books = new Book[booksNum];
        readers = new Reader[readerNum];
    }

    public String bookStatus(String title) {
        for (Book book : books) {
            if (book == null) {
                return "";
            }

            if (title.equals(book.getTitle())) {
                if (book.IsLent()) {
                    return book.getReader().getName();
                } else {
                    return "available";
                }
            }
        }
        return "not in library";
    }

    public void printReadersReport() {
        for (Reader reader : readers) {
            if (reader == null) {
                return;
            }
            System.out.print(
                    "Reader's name: " + reader.getName() +
                            " \n Number of books lent: " + reader.getNumOfBooks() +
                            " \n"
            );
            for (Book book : books) {
                if (book == null) {
                    return;
                }
                if (Objects.equals(book.getReader().getName(), reader.getName())) {
                    System.out.print(
                            "Book's name: \t" + book.getReader().getName()
                    );
                }
            }
            System.out.println();
        }
    }
}
