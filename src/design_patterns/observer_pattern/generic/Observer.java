package design_patterns.observer_pattern.generic;

import design_patterns.observer_pattern.ObserverInterface;

public class Observer<T> implements ObserverInterface<T> {
    private final ObservableInterface<T> observable;
    private final Callback<T> callback;

    public Observer(ObservableInterface<T> observable, Callback<T> callback) {
        this.observable = observable;
        this.callback= callback;
    }

    @Override
    public void update() {
        callback.onUpdate(observable.getData());
    }

    public interface Callback<T>{
        public void onUpdate(T data);
    }
}
