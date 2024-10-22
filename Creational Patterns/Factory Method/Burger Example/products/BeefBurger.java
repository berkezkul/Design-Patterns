package products;

public class BeefBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing beef burger...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking beef burger...");
    }

    @Override
    public void box() {
        System.out.println("Boxing beef burger...");
    }
}
