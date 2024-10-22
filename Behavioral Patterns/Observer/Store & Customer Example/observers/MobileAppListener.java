package observers;

public class MobileAppListener implements Observer {
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Mobile notification to " + username + ": " + eventType + " - " + message);
    }
}
