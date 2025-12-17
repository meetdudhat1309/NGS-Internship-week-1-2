package oop.assignmentQ02;

public abstract class Employee {
    private final int id;
    private String name;
    private int basicSalary;

    public Employee(int id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public abstract void calculateSalary();

//    public void calculateSalary(int hraPercentage, int daPercentage, int taxPercentage) {
//        int netSalary = basicSalary;
//        netSalary += (basicSalary * (hraPercentage / 100));
//        netSalary += (basicSalary * (daPercentage / 100));
//        netSalary -= (basicSalary * (taxPercentage / 100));
//        System.out.println("Your net salary is: " + netSalary);
//    }
//
//    public void calculateSalary(int workingHour) {
//        int netSalary = basicSalary * workingHour;
//        System.out.println("Your net salary is: " + netSalary);
//    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void getEmployeeDetail() {
        System.out.println();
        System.out.println("*******************************************************************************************");
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("*******************************************************************************************");
    }
}
