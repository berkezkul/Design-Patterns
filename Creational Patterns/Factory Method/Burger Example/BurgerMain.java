import restaurants.BeefBurgerRestaurant;
import restaurants.VeggieBurgerRestaurant;
import restaurants.ChickenBurgerRestaurant;
import restaurants.Restaurant;

public class BurgerMain {
    public static void main(String[] args) {
        // BeefBurger restoranı
        Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        beefBurgerRestaurant.orderBurger();

        System.out.println();

        // VeggieBurger restoranı
        Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        veggieBurgerRestaurant.orderBurger();

        System.out.println();

        // ChickenBurger restoranı
        Restaurant chickenBurgerRestaurant = new ChickenBurgerRestaurant();
        chickenBurgerRestaurant.orderBurger();
    }
}
