public class Book {
    private final String title;
    private final String author;
    private final boolean available;
    private final int price;

    public Book(String title, String author, boolean available, int price) {
        this.title = title;
        this.author = author;
        this.available = available;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                ", price=" + price;
    }
}
