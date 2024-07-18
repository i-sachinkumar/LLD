package design_patterns.strategy_pattern.corrected;

public class SpecialDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("driving with special driving strategy");
    }
}
