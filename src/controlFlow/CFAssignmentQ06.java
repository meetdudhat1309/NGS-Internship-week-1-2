package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ06 {
//    TODO: Problem 6: Employee Salary Calculation
//    Create a program that calculates net salary:
//    Input: basic salary
//    Conditions:
//    If basic ≤ 10,000 → HRA = 20%, DA = 80%
//    If basic ≤ 20,000 → HRA = 25%, DA = 90%
//    Else → HRA = 30%, DA = 95%
//    Calculate and print:
//    Gross Salary
//    Use if–else ladder

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your basic salary: ");
        double salary = sc.nextDouble();
        double hra = salary;
        double da = salary;
        if (salary <= 10000) {
            hra *= 0.2;
            da *= 0.8;
            double grossSalary = salary + da + hra;
            System.out.println("Gross salary is: " + grossSalary);
        } else if (salary <= 20000) {
            hra *= 0.25;
            da *= 0.9;
            double grossSalary = salary + da + hra;
            System.out.println("Gross salary is: " + grossSalary);
        } else {
            hra *= 0.3;
            da *= 0.95;
            double grossSalary = salary + da + hra;
            System.out.println("Gross salary is: " + grossSalary);
        }

    }
}
