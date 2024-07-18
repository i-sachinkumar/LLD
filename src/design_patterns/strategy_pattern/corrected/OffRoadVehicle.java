package design_patterns.strategy_pattern.corrected;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SpecialDrivingStrategy());
    }
}
