package Command;

import Receiver.MediaPlayerApp;

public class PauseCommand implements MediaPlayerCommand {

    private MediaPlayerApp mediaPlayer;

    public PauseCommand(MediaPlayerApp mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }

    public void execute(){
        mediaPlayer.pause();
    }

    public void undo(){
        mediaPlayer.play();
    }
}
