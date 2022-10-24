package Associations;

import java.util.ArrayList;
import java.util.Arrays;

public class Association {
    public static void main(String[] args) {

        // Driver ----------- Vehicle
        // both has independent life cycle
        // Driver "Has a" or "Uses a" Vehicle

        ArrayList<Vehicle> vehiclePoolA = new ArrayList<>();
        vehiclePoolA.add( new Vehicle("Audi", 2022, new ArrayList<>(Arrays.asList( new Part("AudiEngine"), new Part("AudiChassis")))));
        vehiclePoolA.add( new Vehicle("Volce", 2022, new ArrayList<>(Arrays.asList( new Part("VolvoEngine"), new Part("VolvoChassis")))));

        Driver driver = new Driver();

        driver.rentVehicle(vehiclePoolA.get(0));
        driver.driveVehicle();
        driver.returnVehicle();
    }
}
