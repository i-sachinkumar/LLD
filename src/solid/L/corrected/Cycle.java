package solid.L.corrected;

public class Cycle implements Bike {
    private int speed;

    public Cycle() {
        this.speed = 0;
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
