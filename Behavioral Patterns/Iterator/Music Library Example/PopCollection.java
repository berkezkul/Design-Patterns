import java.util.Iterator;
//Using Array
public class PopCollection implements MusicCollection{
    private MusicItem [] songs;
    private final int MAX_SIZE = 5;
    private int numberOfSongs = 0;

    public PopCollection(){
        songs = new MusicItem[MAX_SIZE];
        addItem("Bengü Beker", "Defterli", 3.45);
        addItem("Tarkan", "Ölürüm Sana", 3.52);
    }

    public void addItem(String singer, String song, double duration){
        if(numberOfSongs >= MAX_SIZE){
            System.out.println("Pop collection is full");
        }else{
            songs[numberOfSongs] = new MusicItem(singer,song,duration);
            numberOfSongs++;
        }
    }
    @Override
    public Iterator<MusicItem> createIterator() {
        return new PopCollectionIterator(songs);
    }
}
