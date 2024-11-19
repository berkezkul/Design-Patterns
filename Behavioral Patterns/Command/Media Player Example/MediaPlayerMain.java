public class MediaPlayerMain {
    public static void main(String[] args) {
        MediaPlayerApp mediaPlayer = new MediaPlayerApp();

        MediaPlayerCommand mediaPlayerPlay = new PlayCommand(mediaPlayer);
        MediaPlayerCommand mediaPlayerPause = new PauseCommand(mediaPlayer);

        MediaPlayerCommand playCommand = new PlayCommand(mediaPlayer);
        MediaPlayerCommand pauseCommand = new PauseCommand(mediaPlayer);
        MediaPlayerCommand stopCommand = new StopCommand(mediaPlayer);

        // Remote Control (Invoker)
        RemoteControl remote = new RemoteControl();

        // Play
        remote.setCommand(playCommand);
        remote.pressButton();

        // Pause
        remote.setCommand(pauseCommand);
        remote.pressButton();

        // Undo Pause (Play again)
        remote.pressUndo();

        // Stop
        remote.setCommand(stopCommand);
        remote.pressButton();

        // Undo Stop (Play again)
        remote.pressUndo();

    }
}
