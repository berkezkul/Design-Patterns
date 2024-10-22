package products;

public class VeggieBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing veggie burger...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking veggie burger...");
    }

    @Override
    public void box() {
        System.out.println("Boxing veggie burger...");
    }
}
