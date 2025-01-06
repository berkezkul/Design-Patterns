import java.util.ArrayList;
import java.util.Iterator;

//Using Arraylist
public class RockCollection implements MusicCollection{
    private ArrayList<MusicItem> songs;

    public RockCollection(){
        songs = new ArrayList<>();
        addItem("Barış Akarsu", "Islak Islak", 3.53);
        addItem("Madrigal", "Ne Zamandır Sendeydim", 3.37);
    }

    public void addItem(String singer, String song, double duration){
        songs.add(new MusicItem(singer,song,duration));
    }
    @Override
    public Iterator<MusicItem> createIterator() {
        return songs.iterator();
    }
}
