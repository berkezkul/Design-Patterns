import ingredient.ChicagoPizzaIngredientFactory;
import ingredient.NYPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import pizza.Pizza;

public class PizzaMain {
    public static void main(String[] args) {
        // New York ve Chicago için gerekli ingredient fabrikaları
        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
        PizzaIngredientFactory chicagoIngredientFactory = new ChicagoPizzaIngredientFactory();

        // New York tarzı pizza mağazası oluştur
        PizzaStore nyStore = new NYPizzaStore(new SimplePizzaFactory(nyIngredientFactory));

        // Chicago tarzı pizza mağazası oluştur
        PizzaStore chicagoStore = new ChicagoPizzaStore(new SimplePizzaFactory(chicagoIngredientFactory));


        // New York tarzı bir Pepperoni Pizza siparişi
        Pizza pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        // Chicago tarzı bir Cheese Pizza siparişi
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        // Chicago tarzı bir Veggie Pizza siparişi ver
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Alice ordered a " + pizza.getName() + "\n");
    }
}
