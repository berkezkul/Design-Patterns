package ingredient;

import ingredient.cheese.Cheese;
import ingredient.clams.Clams;
import ingredient.dough.Dough;
import ingredient.vegetables.Vegetables;
import ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
    Vegetables createVegetables();
}
