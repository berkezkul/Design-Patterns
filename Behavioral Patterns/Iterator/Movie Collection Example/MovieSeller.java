import java.util.Iterator;

public class MovieSeller {
    private MovieCollection[] movies;

    public MovieSeller(MovieCollection...movies){
        this.movies = movies;
    }

    public void printMovie(){
        for(MovieCollection movie: movies){
            printMovie(movie.createIterator());
        }
    }

    private void printMovie(Iterator <MovieItem> iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
