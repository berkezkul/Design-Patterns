import ingredient.NYPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
