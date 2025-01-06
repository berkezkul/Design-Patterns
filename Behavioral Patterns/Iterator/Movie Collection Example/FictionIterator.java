import java.util.Iterator;

public class FictionIterator implements Iterator <MovieItem> {
    private MovieItem[] items;
    private int position = 0;

    public FictionIterator(MovieItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MovieItem next() {
        return items[position++];
    }
}
