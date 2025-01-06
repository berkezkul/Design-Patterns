// Home Theater Facade
public class MoviePreparationFacade {

    private final Projector projector;
    private final Lights lights;
    private final Amplifier amplifier;
    private final DVDPlayer dvdPlayer;
    private final PopcornPopper popper;

    public MoviePreparationFacade(Lights lights, Projector projector, DVDPlayer dvdPlayer, PopcornPopper popper, Amplifier amplifier) {
        this.lights = lights;
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
        this.popper = popper;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movieName){
        System.out.println("Turning on movie system...");
        popper.on();
        popper.pop();

        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movieName);

    }

    public void endMovie() {
        System.out.println("Turning off movie system...");
        lights.on();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }

}
