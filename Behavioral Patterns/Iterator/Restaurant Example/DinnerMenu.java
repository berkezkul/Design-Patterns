import java.util.HashMap;
import java.util.Iterator;
//Using Hash Map

public class DinnerMenu implements RMenu{
    private HashMap<String, RMenuItem> menuItems;

    public DinnerMenu() {
        menuItems = new HashMap<>();
        addItem("Steak", "Grilled steak with vegetables", false, 15.99);
        addItem("Pasta", "Pasta with creamy Alfredo sauce", true, 12.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new RMenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator <RMenuItem> createIterator() {
        return menuItems.values().iterator();
    }

}
