public class Whip extends CondimentDecorator {
    Coffee coffee;

    public Whip(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.75 + coffee.cost();
    }
}
