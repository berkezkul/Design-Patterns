package subjects;

import observers.Subscriber;

public interface YoutubeSubscriberSubject {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String videoTitle);

}
