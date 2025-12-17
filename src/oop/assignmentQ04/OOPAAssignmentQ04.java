package oop.assignmentQ04;

import oop.assignmentQ03.*;

public class OOPAAssignmentQ04 {
//    TODO: Q4: Vehicle Rental System
//    Build a Vehicle Rental System:
//        Abstract class Vehicle
//            Fields: vehicleNumber, brand, rentPerDay
//            Abstract method calculateRent(days)
//        Subclasses:
//            Car
//            Bike
//            Truck
//        Implement different rent logic for each vehicle type
//        Create a service class to:
//            Rent vehicle
//            Display total rent

    public static void main(String[] args) {

        Vehicle defender = new Car(1111, "Land Rover: Defender", 25000, 4);
        Vehicle shine = new Bike(1234, "Honda shine", 500, 2);
        Vehicle man = new Truck(2222, "Man truck", 10000, 3);

        VehicleService vs = new VehicleService();
        vs.rentVehicle(defender);
        vs.rentVehicle(shine);
        vs.rentVehicle(man);
        vs.calculateTotalRent();
    }
}
