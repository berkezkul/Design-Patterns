public class GameConsole {
    public ConsoleState state;

    public GameConsole() {
        state = new OffState();
    }

    public void setState(ConsoleState state) {
        this.state = state;
    }

    public void pressPowerButton() {
        state.pressPowerButton(this);
    }

    public void pressMenuButton() {
        state.pressMenuButton(this);
    }

    public void pressPlayButton() {
        state.pressPlayButton(this);
    }


}
