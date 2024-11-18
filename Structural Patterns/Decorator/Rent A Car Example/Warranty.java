public class Warranty extends ExtrasForTrip {
    Car car;

    public Warranty(Car car){
        this.car = car;
    }
    @Override
    public String getDescription() {
        return car.getDescription() + ", Warranty";
    }

    @Override
    public double cost() {
        return 1500 + car.cost();
    }
}
