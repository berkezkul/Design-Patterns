public class NoQuarterState implements GmState {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Quarter inserted.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("No quarter to eject.");
    }

    public void turnCrank() {
        System.out.println("Insert a quarter first.");
    }

    public void dispense() {
        System.out.println("Pay first.");
    }
}
