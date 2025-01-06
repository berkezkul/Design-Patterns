import java.util.Iterator;

public class PopCollectionIterator implements Iterator <MusicItem>{
    private MusicItem [] songs;
    private int position = 0;

    public PopCollectionIterator(MusicItem[] songs){
        this.songs = songs;
    }
    @Override
    public boolean hasNext() {
        return position < songs.length && songs[position] != null;
    }

    @Override
    public MusicItem next() {
        return songs[position++];
    }
}
