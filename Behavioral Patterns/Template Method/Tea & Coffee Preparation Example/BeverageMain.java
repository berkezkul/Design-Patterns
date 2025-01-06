public class BeverageMain {
    public static void main(String[] args) {
        CaffeineBeverage tea = new PreparationTea();
        CaffeineBeverage coffee = new PreparationCoffee();

        System.out.println("\nPreparing tea:");
        tea.prepareRecipe();

        System.out.println("\nPreparing coffee:");
        coffee.prepareRecipe();
    }

}
