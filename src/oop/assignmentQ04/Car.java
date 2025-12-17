package oop.assignmentQ04;

public class Car extends Vehicle {

    public Car(int vehicleNo, String brand, int rentPerDay, int day) {
        super(vehicleNo, brand, rentPerDay, day);
    }

    @Override
    float calculateRent(int days) {
        return days * getRentPerDay()* (0.9f); // 10% discount
    }
}
