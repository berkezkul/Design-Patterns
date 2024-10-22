public class DbConnection {
    private static DbConnection instance;

    // Veritabanı bağlantısı oluşturma: constructor private
    private DbConnection() {
        //connection kurulma
        System.out.println("Veritabanı bağlantısı kuruldu.");
    }

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    // Veritabanına sorgu gönderme metodu
    public void query(String sql) {
        System.out.println("Sorgu çalıştırıldı: " + sql);
    }
}