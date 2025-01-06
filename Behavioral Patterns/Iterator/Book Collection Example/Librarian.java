import java.util.Iterator;

public class Librarian {

    private BookCollection[] collections;

    public Librarian(BookCollection... collections) {
        this.collections = collections;
    }

    public void printBooks() {
        for (BookCollection collection : collections) {
            Iterator iterator = collection.createIterator();
            printCollection(iterator);
        }
    }

    private void printCollection(Iterator iterator) {
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}
