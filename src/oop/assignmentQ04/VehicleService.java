package oop.assignmentQ04;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {
    List<Vehicle> vehicles;

    public VehicleService() {
        vehicles = new ArrayList<>();
    }

    public void rentVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void calculateTotalRent() {
        float rent = 0;
        for (Vehicle v : vehicles) {
            rent += v.calculateRent(v.getDaysToRent());
        }
        System.out.println("Total rent for your vehicles is: " + rent);
    }
}
