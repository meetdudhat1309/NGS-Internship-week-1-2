package oop.assignmentQ04;

public class Bike extends Vehicle {


    public Bike(int vehicleNo, String brand, int rentPerDay, int day) {
        super(vehicleNo, brand, rentPerDay, day);
    }

    @Override
    float calculateRent(int days) {
        return days * getRentPerDay() * (0.95f); // 5% discount
    }
}
