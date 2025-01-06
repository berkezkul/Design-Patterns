public class CWaitress {
    private final MenuComponent allMenus;

    public CWaitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
