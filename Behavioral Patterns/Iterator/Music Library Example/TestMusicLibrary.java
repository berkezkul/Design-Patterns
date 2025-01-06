public class TestMusicLibrary {
    public static void main(String[] args) {
        MusicCollection pop = new PopCollection();
        MusicCollection rock = new RockCollection();
        MusicCollection arabesque = new ArabasqueCollection();
        MusicCollection rap = new RapCollection();

        MusicLibrary library = new MusicLibrary(pop, rock, arabesque, rap);
        library.printMusicList();

    }
}
