package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ09 {
//    TODO: Problem 9: Electricity Bill Calculator
//    Create a program that calculates electricity bill based on units consumed:
//    Up to 100 units → ₹2/unit
//    101–200 units → ₹3/unit
//    201–300 units → ₹5/unit
//    Above 300 units → ₹7/unit
//    Add fixed charge of ₹150
//    Use if–else ladder
//    Display total bill amount

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billAmt = 150;
        System.out.print("Enter your consumed unit: ");
        int unit = sc.nextInt();

        if (unit <= 100) {
            billAmt += (unit * 2);
        } else if (unit <= 200) {
            billAmt += (unit * 3);
        } else if (unit <= 300) {
            billAmt += (unit * 5);
        } else {
            billAmt += (unit * 7);
        }
        System.out.println("Your electricity bill is: "+ billAmt);
    }
}
