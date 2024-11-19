package pizza;

import ingredient.cheese.Cheese;
import ingredient.clams.Clams;
import ingredient.dough.Dough;
import ingredient.vegetables.Vegetables;
import ingredient.sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clam;
    Vegetables vegetables;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
