package oop.assignmentQ02;

public class ContractEmployee extends Employee {

    int totalHours;

    public ContractEmployee(int id, String name, int basicSalary, int totalHours) {
        super(id, name, basicSalary);
        this.totalHours = totalHours;
    }

    @Override
    public void calculateSalary() {
        int netSalary = getBasicSalary()*totalHours;
        System.out.println("Your net salary is: "+ netSalary);
    }
}
