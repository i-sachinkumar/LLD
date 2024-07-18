package design_patterns.strategy_pattern.corrected;

public class Vehicle {
    public final DrivingStrategy drivingStrategy;

    public Vehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }
}
