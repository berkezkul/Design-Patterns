public class DatabaseMain {
    public static void main(String[] args) {
        OldDatabaseConnection odc = new OldDatabaseConnection();

        DatabaseAdapter da = new DatabaseAdapter(odc);

        da.connect();
        da.disconnect();
    }
}
