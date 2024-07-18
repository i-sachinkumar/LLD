package solid.L.corrected;

public class MotorCycle extends EngineVehicle {
    private int speed;
    private boolean engineOn;

    public MotorCycle() {
        this.speed = 0;
        this.engineOn = false;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }

    @Override
    public void brake() {
        speed = 0;
    }

}
