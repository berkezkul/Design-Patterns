package ingredient;

import ingredient.cheese.Cheese;
import ingredient.cheese.MozzarellaCheese;
import ingredient.clams.Clams;
import ingredient.clams.FrozenClams;
import ingredient.dough.Dough;
import ingredient.dough.ThickCrustDough;
import ingredient.vegetables.RedPepper;
import ingredient.vegetables.Vegetables;
import ingredient.sauce.PlumTomatoSauce;
import ingredient.sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Vegetables createVegetables() {
        return new RedPepper();
    }


}