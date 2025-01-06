public class TestLibrarian {

    public static void main(String[] args) {
        BookCollection library = new Library();
        BookCollection digitalLibrary = new DigitalLibrary();
        BookCollection bookstore = new Bookstore();

        Librarian librarian = new Librarian(library, digitalLibrary, bookstore);
        librarian.printBooks();
    }
}
