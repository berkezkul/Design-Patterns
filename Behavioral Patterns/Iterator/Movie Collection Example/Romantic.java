import java.util.Iterator;
import java.util.LinkedList;

//Using Linkedlist
public class Romantic implements MovieCollection{
    private LinkedList<MovieItem> movieItems;

    public Romantic(){
        movieItems = new LinkedList<>();
        addItem("İkimizin Yerine", "Umur Turagay", 125);
    }

    public void addItem(String title, String director, double price){
        movieItems.add(new MovieItem(title, director, price));
    }

    @Override
    public Iterator<MovieItem> createIterator() {
        return movieItems.iterator();
    }
}
