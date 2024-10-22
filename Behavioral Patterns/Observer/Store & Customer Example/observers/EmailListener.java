package observers;

public class EmailListener implements Observer {
    private final String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("E-mail to " + email + ": " + eventType + " - " + message);
    }
}
