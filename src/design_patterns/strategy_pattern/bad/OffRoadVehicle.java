package design_patterns.strategy_pattern.bad;

public class OffRoadVehicle extends Vehicle{
    //this vehicle need special driving strategy
    @Override
    public void drive() {
        System.out.println("driving with special driving strategy");
    }
    // we can see that drive method among sibling OffRoadVehicle and SportVehicle id duplicated
}
