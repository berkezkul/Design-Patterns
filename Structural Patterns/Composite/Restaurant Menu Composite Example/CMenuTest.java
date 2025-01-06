public class CMenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Desserts of course!");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);

        pancakeMenu.add(new CMenuItem("Pancake", "Delicious pancake", true, 2.99));
        dinerMenu.add(new CMenuItem("Pasta", "Spaghetti with marinara sauce", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new CMenuItem("Ice Cream", "Vanilla Ice Cream", true, 1.59));

        CWaitress waitress = new CWaitress(allMenus);
        waitress.printMenu();
    }
}
