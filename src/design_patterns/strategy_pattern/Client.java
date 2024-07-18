package design_patterns.strategy_pattern;

import design_patterns.strategy_pattern.bad.PassengerVehicle;
import design_patterns.strategy_pattern.bad.SportVehicle;
import design_patterns.strategy_pattern.bad.Vehicle;

public class Client {
    public static void main(String[] args) {
        // corrected

        Vehicle sportVehicle = new SportVehicle();
        System.out.println("driving sport vehicle:");
        sportVehicle.drive();


        System.out.println();
        System.out.println();


        Vehicle passengerVehicle = new PassengerVehicle();
        System.out.println("driving passenger vehicle:");
        passengerVehicle.drive();
    }
}