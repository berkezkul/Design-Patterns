import ingredient.NYPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.VeggiePizza;

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
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
