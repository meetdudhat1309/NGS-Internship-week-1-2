package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ03 {
//    TODO: Problem 3: ATM Withdrawal Simulation
//    Write a program to simulate an ATM withdrawal system:
//    Initial balance is ₹10,000
//    User enters withdrawal amount
//    Conditions:
//    Amount must be a multiple of 100
//    Amount must not exceed balance
//    Deduct amount and display remaining balance
//    Allow multiple withdrawals using a loop
//    Stop when user enters 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        while (true) {
            System.out.println("***********************************************************************");
            System.out.print("Enter amount to withdraw: ");
            int amt = sc.nextInt();
            if (amt == 0) break;
            if (amt % 100 == 0) {
                if (amt <= balance) {
                    balance -= amt;
                    System.out.println("Amount withdraw successfully:)");
                    System.out.println("Remaining balance is : " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
            } else {
                System.out.println("Amount must be multiple of 100!");
            }
        }
    }
}
