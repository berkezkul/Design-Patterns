public class ChildSeat extends ExtrasForTrip{
    Car car;

    public ChildSeat(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Child Seat";
    }

    @Override
    public double cost() {
        return 800 + car.cost();
    }
}
