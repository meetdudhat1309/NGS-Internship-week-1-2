package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ04 {
//    TODO: Problem 4: Number Classification Program
//    Write a program that takes an integer number and:
//    Determines whether it is:
//    Positive or Negative
//    Even or Odd
//    If the number is greater than 100, print "Large Number"
//    Use nested if–else statements

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num<0) System.out.println("Number is Negative");
        else System.out.println("Number is Positive");

        if (num%2==0) System.out.println("Number is Even");
        else System.out.println("Number is Odd");

        if (num>100) System.out.println("Large Number");
        else System.out.println("Small Number");
    }
}
