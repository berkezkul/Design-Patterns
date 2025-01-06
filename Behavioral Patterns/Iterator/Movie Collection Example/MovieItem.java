public class MovieItem {
    private final String title;
    private final String director;
    private final double price;

    public MovieItem(String title, String director, double price){
        this.title = title;
        this.director = director;
        this.price = price;
    }

    public String getTitle(){ return title;}
    public String getDirector(){return director;}
    public double getPrice(){ return price;}

    @Override
    public String toString() {
        return "MovieItem{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", price=" + price +
                '}';
    }
}
