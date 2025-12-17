package oop.assignmentQ04;

public class Truck extends Vehicle {


    public Truck(int vehicleNo, String brand, int rentPerDay, int day) {
        super(vehicleNo, brand, rentPerDay, day);
    }

    @Override
    float calculateRent(int days) {
        return days * getRentPerDay() * (0.80f); // 20% discount
    }
}
