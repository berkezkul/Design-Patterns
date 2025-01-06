import java.util.Iterator;

public class Library implements BookCollection {

    private Book[] books;
    private int numberOfBooks = 0;
    private int maxBooks = 10;

    public Library() {
        books = new Book[maxBooks];
        addBook("Design Patterns", "Gamma et al.", true, 50);
        addBook("Effective Java", "Joshua Bloch", true, 45);
        addBook("Clean Code", "Robert Martin", true, 40);
    }

    public void addBook(String title, String author, boolean available, int price) {
        if (numberOfBooks >= maxBooks) {
            throw new ArrayIndexOutOfBoundsException("Library is full, cannot add more books.");
        }
        books[numberOfBooks] = new Book(title, author, available, price);
        numberOfBooks++;
    }

    @Override
    public Iterator createIterator() {
        return new LibraryIterator(books);
    }
}
