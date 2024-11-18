public class NavigationSystem extends ExtrasForTrip {
    Car car;

    public NavigationSystem(Car car){
        this.car = car;
    }
    @Override
    public String getDescription() {
        return car.getDescription() + ", NavigationSystem";
    }

    @Override
    public double cost() {
        return 2000 + car.cost();
    }
}
