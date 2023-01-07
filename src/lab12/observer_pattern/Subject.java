package lab12.observer_pattern;
import java.util.List;
import java.util.ArrayList;


public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        // TODO Auto-generated method stub
        for(Observer e: observers) {
            e.update();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
