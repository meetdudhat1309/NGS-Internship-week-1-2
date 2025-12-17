package oop.assignmentQ04;

abstract class Vehicle {
    private int vehicleNo;
    private String brand;
    private int rentPerDay;
    private int daysToRent;

    public Vehicle(int vehicleNo, String brand, int rentPerDay, int daysToRent) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.daysToRent = daysToRent;
    }

    public int getDaysToRent() {
        return daysToRent;
    }


    public int getRentPerDay() {
        return rentPerDay;
    }

    public void getVehicleDetails(){
        System.out.println("Vehicle no: "+vehicleNo);
        System.out.println("Vehicle brand: "+brand);
        System.out.println("Rent per day: "+rentPerDay);
        System.out.println("No. of days to rent vehicle: "+ daysToRent);
    }

    abstract float calculateRent(int days);
}
