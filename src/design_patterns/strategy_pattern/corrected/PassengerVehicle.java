package design_patterns.strategy_pattern.corrected;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new BasicDrivingStrategy());
    }
}
