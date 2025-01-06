import java.util.Iterator;

public class LibraryIterator implements Iterator {
    private Book[] books;
    private int position = 0;

    public LibraryIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.length && books[position] != null;
    }

    @Override
    public Object next() {
        return books[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported.");
    }
}
