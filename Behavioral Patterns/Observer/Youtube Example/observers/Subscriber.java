package observers;

// Observer arayüzü - Abone (Subscriber)
public interface Subscriber {
    void update(String channelName, String videoTitle);
}
