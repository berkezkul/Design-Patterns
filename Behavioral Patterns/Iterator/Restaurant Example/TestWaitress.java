public class TestWaitress {
    public static void main(String[] args) {
        RMenu breakfastMenu = new BreakfastMenu();
        RMenu lunchMenu = new LunchMenu();
        RMenu dinnerMenu = new DinnerMenu();
        RMenu snackMenu = new SnackMenu();

        RWaitress waitress = new RWaitress(breakfastMenu, lunchMenu, dinnerMenu, snackMenu);
        waitress.printMenu();
    }

}
