package design_patterns.observer_pattern.generic;

import design_patterns.observer_pattern.ObserverInterface;

import java.util.HashSet;
import java.util.Set;

public class Observable<T> implements ObservableInterface<T> {
    private T data;
    private final Set<ObserverInterface<T>> observers = new HashSet<>();
    @Override
    public void registerObserver(ObserverInterface<T> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface<T> observer : observers){
            observer.update();
        }
    }

    @Override
    public void setData(T data) {
        this.data = data;
        notifyObservers();
    }

    @Override
    public T getData() {
        return data;
    }
}
