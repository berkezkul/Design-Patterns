public class CarRentalBalance {
    public static void main(String[] args) {
        Car car = new SedanCar();
        System.out.println(car.getDescription() + " $" + car.cost());

        Car car1 = new Jeep();
        car1 = new Warranty(car1);
        car1 = new ChildSeat(car1);
        System.out.println(car1.getDescription() + " $" + car1.cost());

        Car car2 = new Hatchback();
        car2 = new Warranty(car2);
        car2 = new NavigationSystem(car2);
        car2 = new ChildSeat(car2);
        System.out.println(car2.getDescription() + " $" + car2.cost());

    }
}
