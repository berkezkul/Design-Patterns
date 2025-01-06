public class HomeTheaterMain {
    public static void main(String[] args) {
        // Create Subsystem components
        Lights lights = new Lights();
        Projector projector = new Projector();
        DVDPlayer dvdPlayer = new DVDPlayer();
        PopcornPopper popper = new PopcornPopper();
        Amplifier amplifier = new Amplifier();

        // Create facade
        MoviePreparationFacade moviePreparation = new MoviePreparationFacade(lights, projector, dvdPlayer, popper, amplifier);

        // Film starting
        moviePreparation.watchMovie("The Matrix");
        moviePreparation.endMovie();
    }
}
