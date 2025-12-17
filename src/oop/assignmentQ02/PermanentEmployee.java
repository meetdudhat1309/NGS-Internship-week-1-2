package oop.assignmentQ02;

public class PermanentEmployee extends Employee {

    float hraPercentage;
    float daPercentage;
    float taxPercentage;

    public PermanentEmployee(int id, String name, int basicSalary, float hraPer, float daPer, float taxPer) {
        super(id, name, basicSalary);
        this.hraPercentage = hraPer;
        this.daPercentage = daPer;
        this.taxPercentage = taxPer;
    }

    @Override
    public void calculateSalary() {
        float netSalary = getBasicSalary() ;
        netSalary += (getBasicSalary() * (hraPercentage / 100));
        netSalary += (getBasicSalary() * (daPercentage / 100));
        netSalary -= (getBasicSalary() * (taxPercentage / 100));
        System.out.println("Your net salary is: " + netSalary);
    }

}
