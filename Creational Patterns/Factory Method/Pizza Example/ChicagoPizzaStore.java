import ingredient.ChicagoPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("pepperoni")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        return pizza;
    }
}
