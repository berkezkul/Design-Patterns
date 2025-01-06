import java.util.Iterator;
import java.util.LinkedList;
//Using Linkedlist
public class RapCollection implements MusicCollection{
    private LinkedList<MusicItem> songs;

    public RapCollection(){
        songs = new LinkedList<>();
        addItem("Sagopa Kajmer", "Tek Başınalığın Yolculuğu", 4.12);
        addItem("Hidra", "Cennetten Cehenneme", 3.38);
        addItem("Gazapizm", "Pisliğin Üstüne Basmışlar", 3.19);
    }

    public void addItem(String singer, String song, double duration){
        songs.add(new MusicItem(singer,song,duration));
    }
    @Override
    public Iterator<MusicItem> createIterator() {
        return songs.iterator();
    }
}
