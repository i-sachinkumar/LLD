package design_patterns.observer_pattern;

public interface WeatherStationObservableInterface {
    public void add(ObserverInterface observer);
    public boolean remove(ObserverInterface observer);
    public void notifyChanges();
    public void setTemperature(int temperature);
    public int getTemperature();
}
