package lab12.observer_pattern.eventmanager;
import java.io.File;


public class EmailAlertsListener implements EventListener {
    private String email;
    private String massage;

    public EmailAlertsListener(String email, String massage) {
        this.email = email;
        this.massage = massage;
    }

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email +
                ": Someone has performed " + eventType +
                " operation with the following file: " +
                file.getName());
    }
}
