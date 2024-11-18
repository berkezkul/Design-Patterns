public class StarbucksCoffee {
    public static void main(String[] args) {
        Coffee coffee = new Americano();
        coffee = new Whip(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        Coffee coffee1 = new CookieCaramelLatte();
        coffee1 = new Milk(coffee1);
        coffee1 = new Whip(coffee1);
        System.out.println(coffee1.getDescription() + " $" + coffee1.cost());
    }
}
