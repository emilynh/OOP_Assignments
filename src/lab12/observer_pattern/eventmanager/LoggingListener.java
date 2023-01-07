package lab12.observer_pattern.eventmanager;
import java.io.File;

public class LoggingListener implements EventListener {
    private File log;
    private String massage;

    public LoggingListener(String log_filename, String massage) {
        this.log = new File(log_filename);
        this.massage = massage;
    }

    public LoggingListener(String log_filename) {
        this.log = new File(log_filename);

    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log +
                ": Someone has performed " + eventType +
                " operation with the following file: " +
                file.getName());
    }
}
