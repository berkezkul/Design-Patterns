package Command;

import Receiver.MediaPlayerApp;

public class PlayCommand implements MediaPlayerCommand {

    private MediaPlayerApp mediaPlayer;

    public PlayCommand(MediaPlayerApp mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void execute() {
        mediaPlayer.play();
    }

    @Override
    public void undo() {
        mediaPlayer.stop();
    }
}
