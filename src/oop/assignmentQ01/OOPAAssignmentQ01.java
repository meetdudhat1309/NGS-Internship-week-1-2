package oop.assignmentQ01;

public class OOPAAssignmentQ01 {
//    TODO: Q1: Bank Account Management System
//    Design a Java application for a Bank Account system with the following requirements:
//    Create a BankAccount class with:
//    Private fields: accountNumber, accountHolderName, balance
//    Constructors to initialize account details
//    Implement methods:
//    deposit(amount)
//    withdraw(amount)
//    getBalance()
//    Extend the system with:
//    SavingsAccount and CurrentAccount classes
//    Override withdrawal rules differently for each account type
//    Demonstrate runtime polymorphism using parent class reference

    public static void main(String[] args) {
        BankAccount ac1 = new SavingAccount("1234567890", "Alice", 200000);
        BankAccount ac2 = new CurrentAccount("9876543210", "Bob", 500000);

        ac1.getAccDetails();
        System.out.println(ac1.getBalance());
        ac1.withdraw(100000);
        ac1.withdraw(10000);
        System.out.println(ac1.getBalance());

        ac2.getAccDetails();
        System.out.println(ac2.getBalance());
        ac2.withdraw(200000);
        ac2.withdraw(100000);
        System.out.println(ac2.getBalance());
    }
}
