package Command;

import Receiver.Light;

public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
