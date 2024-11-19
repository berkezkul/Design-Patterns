import Command.Command;
import Invoker.RemoteControl;
import Receiver.Light;
import Command.TurnOnLightCommand;
import Command.TurnOffLightCommand;

public class LightMain {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();

        Command lightOn = new TurnOnLightCommand(livingRoomLight);
        Command lightOff = new TurnOffLightCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        remoteControl.pressUndoButton();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();

        remoteControl.pressUndoButton();
    }
}
