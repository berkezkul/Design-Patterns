package Invoker;

import Command.Command;

public class RemoteControl {
    private Command slot;
    private Command lastCommand;

    public void setCommand(Command command){
        slot = command;
    }

    public void pressButton(){
        slot.execute();
        lastCommand = slot;
    }

    public void pressUndoButton(){
        if(lastCommand != null){
            lastCommand.undo();
        }
    }


}
