import java.util.HashMap;
import java.util.Iterator;
//Using Hash Map

public class Drama implements MovieCollection{
    private HashMap<String, MovieItem> movieItems;

    public Drama(){
        movieItems = new HashMap<>();
        addItem("Issız Adam", "Çağan Irmak" ,140);
    }

    public void addItem(String title, String director, double price){
        movieItems.put(title, new MovieItem(title, director, price));
    }
    @Override
    public Iterator<MovieItem> createIterator() {
        return movieItems.values().iterator();
    }
}
