import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DigitalLibrary implements BookCollection {

    private Map<String, Book> books = new HashMap<>();

    public DigitalLibrary() {
        addBook("Refactoring", "Martin Fowler", true, 60);
        addBook("The Pragmatic Programmer", "Andrew Hunt", true, 55);
        addBook("Code Complete", "Steve McConnell", true, 70);
    }

    public void addBook(String title, String author, boolean available, int price) {
        books.put(title, new Book(title, author, available, price));
    }

    @Override
    public Iterator createIterator() {
        return books.values().iterator();
    }
}
