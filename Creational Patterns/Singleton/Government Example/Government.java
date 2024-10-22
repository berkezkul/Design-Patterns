public class Government {

    private static Government instance;

    // Private constructor
    private Government() {
        System.out.println("Hükümet oluşturuldu.");
    }

    // Tek bir instance yaratılmasını sağlayan metod
    public static Government getInstance() {
        if (instance == null) {
            instance = new Government();
        }
        return instance;
    }
}