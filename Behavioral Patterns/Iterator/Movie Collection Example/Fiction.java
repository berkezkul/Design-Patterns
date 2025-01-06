import java.util.Iterator;

public class Fiction implements MovieCollection{
    private final MovieItem[] movies;
    private static final int MAX_SIZE = 5;
    private int numberOfItems = 0;

    public Fiction(){
        movies = new MovieItem[MAX_SIZE];
        addItem("Batman", "Christopher Nolan", 120);
        addItem("Avatar", "James Cameron", 100);
    }

    public void addItem(String title, String director, double price){
        if(numberOfItems >= MAX_SIZE){
            System.out.println("Collection is full");
            return;
        }else{
            movies[numberOfItems] = new MovieItem(title, director, price);
            numberOfItems++;
        }
    }
    @Override
    public Iterator<MovieItem> createIterator() {
        return new FictionIterator(movies);
    }
}
