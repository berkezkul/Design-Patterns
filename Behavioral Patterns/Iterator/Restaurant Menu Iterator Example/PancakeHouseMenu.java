import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {
        addItem("Pancake", "Delicious pancake", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
