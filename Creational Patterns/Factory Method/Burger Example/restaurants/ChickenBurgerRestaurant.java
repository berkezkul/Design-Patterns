package restaurants;

import products.Burger;
import products.ChickenBurger;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new ChickenBurger();  // Somut VeggieBurger oluşturuluyor
    }
}
