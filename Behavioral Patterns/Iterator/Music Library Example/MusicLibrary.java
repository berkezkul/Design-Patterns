import java.util.Iterator;

public class MusicLibrary {
    private MusicCollection[] musicCollections;

    public MusicLibrary(MusicCollection...musicCollections){
        this.musicCollections = musicCollections;
    }

    public void printMusicList() {
        for (MusicCollection mc : musicCollections) {
            printMusicList(mc.createIterator());
        }
    }

    private void printMusicList(Iterator<MusicItem> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
