package restaurants;

import products.Burger;

public abstract class Restaurant {
    // Factory Method
    public abstract Burger createBurger();

    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        burger.cook();
        burger.box();
    }
}
