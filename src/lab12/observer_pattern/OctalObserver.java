package lab12.observer_pattern;

public class OctalObserver extends Observer {
    public Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;

    }

    @Override
    public void update() {

    }
}
