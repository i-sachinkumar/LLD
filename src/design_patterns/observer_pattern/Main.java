package design_patterns.observer_pattern;

public class Main {
    public static void main(String[] args) {
        // Observable
        WeatherStationObservableInterface weatherStationObservable = new WeatherStationObservable();


        //Observers
        ObserverInterface mobileDisplayObserver = new MobileDisplayObserver(weatherStationObservable);
        ObserverInterface tvDisplayObserver = new TVDisplayObserver(weatherStationObservable);

        // registering observers
        weatherStationObservable.add(mobileDisplayObserver);
        weatherStationObservable.add(tvDisplayObserver);


        //now we'll just change temperature in observable
        weatherStationObservable.setTemperature(43);

        System.out.println("*************************************************************");

        //now remove mobile display observer
        weatherStationObservable.remove(mobileDisplayObserver);
        weatherStationObservable.setTemperature(38);

        System.out.println("*************************************************************");

        // now, we'll set same temperature again
        weatherStationObservable.setTemperature(38);


        System.out.println("*************************************************************");
        weatherStationObservable.add(mobileDisplayObserver);
        for(int i = 30; i < 40; i++){
            weatherStationObservable.setTemperature(i);
        }

    }
}
