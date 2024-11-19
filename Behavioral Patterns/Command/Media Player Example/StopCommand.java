public class StopCommand implements MediaPlayerCommand{

    private MediaPlayerApp mediaPlayer;

    public StopCommand(MediaPlayerApp mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void execute() {
        mediaPlayer.stop();
    }

    @Override
    public void undo() {
        mediaPlayer.play();
    }
}
