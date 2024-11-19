import ingredient.ChicagoPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import ingredient.vegetables.Mushroom;
import pizza.CheesePizza;
import pizza.Pizza;
import pizza.PepperoniPizza;
import pizza.VeggiePizza;


public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        return pizza;
    }
}
