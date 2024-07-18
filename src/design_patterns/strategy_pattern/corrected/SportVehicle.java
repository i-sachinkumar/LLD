package design_patterns.strategy_pattern.corrected;

public class SportVehicle extends Vehicle {
    public SportVehicle() {
        super(new SpecialDrivingStrategy());
    }
}
