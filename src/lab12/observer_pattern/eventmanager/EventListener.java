package lab12.observer_pattern.eventmanager;

import java.io.File;

public interface EventListener {
    void update(String evetType, File file);
}
