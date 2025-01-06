import java.util.ArrayList;
import java.util.Iterator;

//Using Arraylist
public class Action implements MovieCollection{
    private ArrayList<MovieItem> movieItems;

    public Action(){
        movieItems = new ArrayList<>();
        addItems("Gladiator", "Ridley Scott", 180);
    }

    public void addItems(String title, String director, double price){
        movieItems.add(new MovieItem(title,director,price));
    }

    @Override
    public Iterator<MovieItem> createIterator() {
        return movieItems.iterator();
    }
}
