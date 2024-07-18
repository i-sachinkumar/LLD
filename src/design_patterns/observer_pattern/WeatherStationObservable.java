package design_patterns.observer_pattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherStationObservable implements WeatherStationObservableInterface{
    private int temperature = -1;
    private final Set<ObserverInterface> observers = new HashSet<>();

    @Override
    public void add(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public boolean remove(ObserverInterface observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyChanges() {
        for(ObserverInterface observer : observers){
            observer.update();
        }
    }

    @Override
    public void setTemperature(int temperature) {
        if(this.temperature == temperature) return;
        this.temperature = temperature;
        notifyChanges();
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
