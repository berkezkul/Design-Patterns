package restaurants;

import products.Burger;
import products.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();  // Somut VeggieBurger oluşturuluyor
    }
}
