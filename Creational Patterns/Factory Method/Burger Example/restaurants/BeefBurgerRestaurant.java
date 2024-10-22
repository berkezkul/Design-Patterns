package restaurants;

import products.Burger;
import products.BeefBurger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();  // Somut BeefBurger oluşturuluyor
    }
}
