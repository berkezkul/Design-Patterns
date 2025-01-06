import java.util.Iterator;

public class RWaitress {
    private RMenu[] menus;

    public RWaitress(RMenu... menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (RMenu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<RMenuItem> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
