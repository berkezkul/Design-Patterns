import java.util.Iterator;

public class BreakfastMenuIterator implements Iterator <RMenuItem> {
    private RMenuItem [] items;
    private int position = 0;

    public BreakfastMenuIterator(RMenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public RMenuItem next() {
        return items[position++];
    }
}
