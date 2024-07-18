package design_patterns.observer_pattern.generic;

import design_patterns.observer_pattern.ObserverInterface;

public interface ObservableInterface<T>{
    public void registerObserver(ObserverInterface<T> observer);
    public void removeObserver(ObserverInterface<T> observer);
    public void notifyObservers();
    public void setData(T data);
    public T getData();
}
