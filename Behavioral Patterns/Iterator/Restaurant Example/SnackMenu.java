import java.util.Iterator;
import java.util.LinkedList;

public class SnackMenu implements RMenu{
    private LinkedList<RMenuItem> menuItems;

    public SnackMenu() {
        menuItems = new LinkedList<>();
        addItem("Nachos", "Crispy nachos with cheese dip", true, 4.99);
        addItem("Fries", "Golden french fries", true, 3.99);
        addItem("Chicken Wings", "Spicy chicken wings", false, 6.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new RMenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator <RMenuItem> createIterator() {
        return menuItems.iterator();
    }

}
