package oop.assignmentQ02;

import oop.assignmentQ01.BankAccount;
import oop.assignmentQ01.CurrentAccount;
import oop.assignmentQ01.SavingAccount;

public class OOPAAssignmentQ02 {
//    TODO: Q2: Employee Payroll System
//    Base class Employee with:
//      id, name, basicSalary
//      Method calculateSalary()
//    Create subclasses:
//      PermanentEmployee
//      ContractEmployee
//    Each subclass should calculate salary differently


    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(1,"Alice", 50000, 10, 10, 0);
        Employee e2 = new ContractEmployee(2,"Bob", 1000, 18);

        e1.getEmployeeDetail();
        System.out.println(e1.getBasicSalary());
        e1.calculateSalary();
        e2.getEmployeeDetail();
        System.out.println(e2.getBasicSalary());
        e2.calculateSalary();
    }
}
