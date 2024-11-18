package observers;

//Concrete Observer
public class YoutubeSubscriber implements Subscriber {
    private final String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(name + ", you have a new video notification from " + channelName + ": " + videoTitle);
    }
}
