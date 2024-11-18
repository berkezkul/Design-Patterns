import observers.Subscriber;
import observers.YoutubeSubscriber;
import subjects.YoutubeChannel;

public class YoutubeTest {
    public static void main(String[] args) {
        // new youtube channel
        YoutubeChannel techChannel = new YoutubeChannel("Tech World");

        // new subscribe
        Subscriber arda = new YoutubeSubscriber("zobar_arda");
        Subscriber serkan = new YoutubeSubscriber("muglalı_serkan48");
        Subscriber sedef = new YoutubeSubscriber("sedefdonmezz");

        // register new subscribe
        techChannel.registerSubscriber(arda);
        techChannel.registerSubscriber(serkan);
        techChannel.registerSubscriber(sedef);

        // upload new video and send notify to subscribers
        techChannel.uploadVideo("Observer Pattern Explained");

        // unsubscriped
        techChannel.removeSubscriber(arda);

        techChannel.uploadVideo("Java Design Patterns Tutorial");
    }

}
