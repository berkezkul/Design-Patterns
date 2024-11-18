package subjects;

import observers.Observer;

public interface StoreSubject {
    void subscribe(String eventType, Observer observer);
    void unsubscribe(String eventType, Observer observer);
    void notify(String eventType, String message);
}
