public class MoviePreparation {

    Lights lights;
    Projector projector;
    DVDPlayer dvdPlayer;
    PopcornPopper popper;
    Amplifier amplifier;

    public MoviePreparation(Lights lights, Projector projector, DVDPlayer dvdPlayer, PopcornPopper popper, Amplifier amplifier) {
        this.lights = lights;
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
        this.popper = popper;
        this.amplifier = amplifier;
    }

    public void startMovie(String movieName){
        popper.on();
        popper.pop();

        lights.dim(10);
        projector.on();
        amplifier.on();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movieName);
    }

    public void endMovie(){

    }
}
