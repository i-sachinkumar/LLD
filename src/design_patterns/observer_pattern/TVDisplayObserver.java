package design_patterns.observer_pattern;

public class TVDisplayObserver implements ObserverInterface {
    public final WeatherStationObservableInterface weatherStationObservable;
    public TVDisplayObserver(WeatherStationObservableInterface weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
    }
    @Override
    public void update() {
        System.out.println("TV Display -> temperature = " + weatherStationObservable.getTemperature());
    }
}
