import java.util.ArrayList;
import java.util.Iterator;
//Using Arraylist

public class LunchMenu implements RMenu{
    private ArrayList<RMenuItem> menuItems;

    public LunchMenu() {
        menuItems = new ArrayList<>();
        addItem("Burger", "Beef burger with fries", false, 8.99);
        addItem("Salad", "Fresh garden salad", true, 7.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new RMenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator <RMenuItem> createIterator() {
        return menuItems.iterator();
    }
}
