public class Milk extends CondimentDecorator{
    Coffee coffee;

    public Milk(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 1.5 + coffee.cost();
    }
}
