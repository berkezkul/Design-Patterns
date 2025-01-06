import java.util.HashMap;
import java.util.Iterator;

//Using Hashmap
public class ArabasqueCollection implements MusicCollection{
    private HashMap<String, MusicItem> songs;

    public ArabasqueCollection(){
        songs = new HashMap<>();
        addItem("Müslüm Gürses", "İkimizin Yerine", 4.44);
        addItem("Nazan Öncel", "Geceler Kara Tren", 4.21);
    }

    public void addItem(String singer, String song, double duration){
        songs.put(singer, new MusicItem(singer, song, duration));
    }

    @Override
    public Iterator<MusicItem> createIterator() {
        return songs.values().iterator();
    }
}
