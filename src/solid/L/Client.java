package solid.L;

import solid.L.bad.Bike;
import solid.L.bad.Cycle;
import solid.L.bad.MotorCycle;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        // bad in reference to Liskov substitution principle
        List<Bike> bikes = new ArrayList<>();
        bikes.add(new MotorCycle());
        bikes.add(new Cycle());

        // corrected for liskov substitution principle
    }

    public void startBadBike(Bike bike){
        bike.turnOnEngine();
        bike.accelerate();
    }

    public void startCorrectedBike(solid.L.corrected.Bike bike){
        bike.accelerate();
        bike.brake();
    }
}
