import observers.EmailListener;
import observers.MobileAppListener;
import subjects.Store;

public class ObserverMain {
    public static void main(String[] args) {
        // Store oluştur
        Store store = new Store();

        // Dinleyicileri oluştur
        EmailListener emailListener = new EmailListener("customername@gmail.com");
        MobileAppListener mobileListener = new MobileAppListener("user123");

        // Abonelik ekleme
        store.subscribe("newItem", emailListener);
        store.subscribe("sale", mobileListener);

        // Yeni ürün ve indirim bildirimlerini tetikleme
        store.newItemPromotion("Laptop");
        store.salePromotion("50% off on all items!");
    }
}
