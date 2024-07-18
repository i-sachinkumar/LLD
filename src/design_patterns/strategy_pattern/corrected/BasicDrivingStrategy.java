package design_patterns.strategy_pattern.corrected;

public class BasicDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("driving with basic driving strategy");
    }
}
