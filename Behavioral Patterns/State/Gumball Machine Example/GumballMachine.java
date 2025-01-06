public class GumballMachine {
    private GmState noQuarterState;
    private GmState hasQuarterState;
    private GmState soldState;
    private GmState soldOutState;

    private GmState state;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(GmState state) {
        this.state = state;
    }

    public GmState getNoQuarterState() {
        return noQuarterState;
    }

    public GmState getHasQuarterState() {
        return hasQuarterState;
    }

    public GmState getSoldState() {
        return soldState;
    }

    public GmState getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out...");
        if (count != 0) {
            count--;
        }
    }
}
