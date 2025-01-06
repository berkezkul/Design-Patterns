public class FoodMain {
    public static void main(String[] args) {
        Meetball mb = new Meetball();
        Sausage sausage = new Sausage();

        mb.recipe();
        System.out.print("------------------------------ \n");
        sausage.recipe();
    }
}
