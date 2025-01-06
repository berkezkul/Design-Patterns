import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class Bookstore implements BookCollection {

    private List<Book> books = new LinkedList<>();

    public Bookstore() {
        addBook("Clean Architecture", "Robert Martin", true, 50);
        addBook("Domain-Driven Design", "Eric Evans", true, 75);
        addBook("Introduction to Algorithms", "Cormen et al.", true, 90);
    }

    public void addBook(String title, String author, boolean available, int price) {
        books.add(new Book(title, author, available, price));
    }

    @Override
    public Iterator createIterator() {
        return books.iterator();
    }
}
