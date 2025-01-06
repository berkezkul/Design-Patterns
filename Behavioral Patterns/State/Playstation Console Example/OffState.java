public class OffState implements ConsoleState{
    @Override
    public void pressPowerButton(GameConsole console) {
        System.out.println("Playstation is powering ON");
        console.setState(new MenuState());
    }

    @Override
    public void pressMenuButton(GameConsole console) {
        System.out.println("Playstation is OFF. Turn it ON first.");
    }

    @Override
    public void pressPlayButton(GameConsole console) {
        System.out.println("Playstation is OFF. Turn it ON first.");
    }
}
