public class TestDuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();

        simulator.add(new MallardDuck());
        simulator.add(new MallardDuck());
        simulator.add(new MallardDuck());
        simulator.add(new TurkeyAdapter(new WildTurkey()));

        simulator.quackAll();
        simulator.flyAll();
    }
}
