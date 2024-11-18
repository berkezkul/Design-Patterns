package subjects;

import observers.Observer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store implements StoreSubject {
    private final Map<String, List<Observer>> observers = new HashMap<>();

    public Store() {
        this.observers.put("newItem", new ArrayList<>());
        this.observers.put("sale", new ArrayList<>());
    }

    @Override
    public void subscribe(String eventType, Observer observer) {
        List<Observer> users = observers.get(eventType);
        users.add(observer);
    }

    @Override
    public void unsubscribe(String eventType, Observer observer) {
        List<Observer> users = observers.get(eventType);
        users.remove(observer);
    }

    @Override
    public void notify(String eventType, String message) {
        List<Observer> users = observers.get(eventType);
        for (Observer observer : users) {
            observer.update(eventType, message);
        }
    }

    // Mağaza yeni ürün geldiğinde bildirim gönderir
    public void newItemPromotion(String item) {
        notify("newItem", "New item in stock: " + item);
    }

    // Mağaza indirim yaparsa bildirim gönderir
    public void salePromotion(String saleInfo) {
        notify("sale", "Special sale: " + saleInfo);
    }
}
