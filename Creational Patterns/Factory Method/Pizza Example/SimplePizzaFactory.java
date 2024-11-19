import pizza.*;

import ingredient.*; // Ingredient paketlerini de import etmeyi unutmayın.

public class SimplePizzaFactory {
    private PizzaIngredientFactory ingredientFactory;

    public SimplePizzaFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                break;
            default:
                System.out.println("Unknown pizza type: " + type);
        }

        return pizza;
    }
}