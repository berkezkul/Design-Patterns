public abstract class Steakhouse {

    public final void recipe (){
        slicingBread();
        heatingBread();
        addCondiment();
    }

    abstract void addCondiment();

    void slicingBread(){
        System.out.println("Cut and slicing bread");
    }

    void heatingBread(){
        System.out.println("Heating bread");
    }
}
