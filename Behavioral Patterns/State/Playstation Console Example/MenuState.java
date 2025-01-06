public class MenuState implements ConsoleState{
    @Override
    public void pressPowerButton(GameConsole console) {
        System.out.println("Console is powering OFF...");
        console.setState(new OffState());
    }

    @Override
    public void pressMenuButton(GameConsole console) {
        System.out.println("You are already in the menu.");
    }

    @Override
    public void pressPlayButton(GameConsole console) {
        System.out.println("Starting the game...");
        console.setState(new PlayingState());
    }
}
