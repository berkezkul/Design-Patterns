package Invoker;

import Command.MediaPlayerCommand;

public class MPRemoteControl {
    private MediaPlayerCommand slot;
    private MediaPlayerCommand lastCommand;


    public void setCommand(MediaPlayerCommand command) {
        this.slot = command;
    }

    public void pressButton() {
        if (slot != null) {
            slot.execute();
            lastCommand = slot;
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}


