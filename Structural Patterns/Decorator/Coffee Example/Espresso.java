public class Espresso extends Coffee{

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 6.5;
    }
}
