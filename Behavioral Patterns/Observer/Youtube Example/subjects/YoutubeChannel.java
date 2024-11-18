package subjects;

import observers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements YoutubeSubscriberSubject{
    private final String channelName;
    private final List<Subscriber> subscribers;

    // Constructor
    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        if (subscriber != null && !subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println(subscriber + " subscribed " + channelName + " channel.");
        }
    }


    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber + " unsubscribed " + channelName + " channel.");
    }


    @Override
    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channelName, videoTitle); // Her aboneye güncellemeyi bildir
        }
    }

    // Yeni video yüklendiğinde kullanılan metot
    public void uploadVideo(String videoTitle) {
        System.out.println(channelName + " yeni bir video yükledi: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}
