import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    private List<Observer> observers;

    public Topic() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String nuevoTema) {
        for (Observer o : observers) {
            o.update(nuevoTema);
        }
    }
}
