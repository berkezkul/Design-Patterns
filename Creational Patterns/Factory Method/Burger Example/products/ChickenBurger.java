package products;

public class ChickenBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing chicken burger...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking chicken burger...");
    }

    @Override
    public void box() {
        System.out.println("Boxing chicken burger...");
    }
}
