import java.util.Iterator;
//Using Array

public class BreakfastMenu implements RMenu{
    private RMenuItem[] menuItems;
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;


    public BreakfastMenu() {
        menuItems = new RMenuItem[MAX_ITEMS];
        addItem("Pancakes", "Fluffy pancakes with syrup", true, 5.99);
        addItem("Omelette", "Eggs with vegetables and cheese", true, 6.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is full!");
            return;
        }
        menuItems[numberOfItems] = new RMenuItem(name, description, vegetarian, price);
        numberOfItems++;
    }


    @Override
    public Iterator <RMenuItem> createIterator() {
        return new BreakfastMenuIterator(menuItems);
    }
}
