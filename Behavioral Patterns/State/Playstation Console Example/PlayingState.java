public class PlayingState implements ConsoleState{
    @Override
    public void pressPowerButton(GameConsole console) {
        System.out.println("Exiting game and console is powering OFF...");
        console.setState(new OffState());
    }

    @Override
    public void pressMenuButton(GameConsole console) {
        System.out.println("Exiting the game and returning to the menu...");
        console.setState(new MenuState());
    }

    @Override
    public void pressPlayButton(GameConsole console) {
        System.out.println("You are already playing a game.");
    }
}
