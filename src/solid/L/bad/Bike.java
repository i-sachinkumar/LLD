package solid.L.bad;

public class Bike {
    private boolean engineOn = false;
    private int speed = 0;

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed = 0;
    }

    public void turnOnEngine() {
        engineOn = true;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}