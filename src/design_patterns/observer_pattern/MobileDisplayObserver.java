package design_patterns.observer_pattern;

public class MobileDisplayObserver implements ObserverInterface{
    public final WeatherStationObservableInterface weatherStationObservable;
    public MobileDisplayObserver(WeatherStationObservableInterface weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        System.out.println("Mobile Display -> temperature = " + weatherStationObservable.getTemperature());
    }
}
