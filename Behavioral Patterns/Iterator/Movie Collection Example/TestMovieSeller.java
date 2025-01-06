public class TestMovieSeller {
    public static void main(String[] args) {
        MovieCollection action = new Action();
        MovieCollection fiction = new Fiction();
        MovieCollection drama = new Drama();
        MovieCollection romantic = new Romantic();

        MovieSeller ms = new MovieSeller(action, fiction, drama, romantic);
        ms.printMovie();
    }

}
