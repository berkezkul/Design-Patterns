package ingredient;

import ingredient.cheese.Cheese;
import ingredient.cheese.ReggianoCheese;
import ingredient.clams.Clams;
import ingredient.clams.FreshClams;
import ingredient.dough.Dough;
import ingredient.dough.ThinCrustDough;
import ingredient.vegetables.Mushroom;
import ingredient.vegetables.Vegetables;
import ingredient.vegetables.Pepperoni;
import ingredient.sauce.MarinaraSauce;
import ingredient.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Vegetables createVegetables() {
        return new Mushroom();
    }
}


