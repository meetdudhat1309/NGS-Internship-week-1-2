package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ02 {
//    TODO: Problem 2: Menu-Driven Calculator
//    Create a menu-driven calculator using a switch statement that:
//    Displays options:
//    Addition
//    Subtraction
//    Multiplication
//    Division
//    Modulus
//    Exit
//    Takes user choice and two numbers
//    Performs operation until user chooses Exit
//    Handle division by zero using control flow logic (no exception handling)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("************************************************************************");
            System.out.println("Operation menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 6) break;
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Your addition is: " + (num1 + num2));
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("Your subtraction is: " + (num1 - num2));
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("Your multiplication is: " + (num1 * num2));
                    System.out.println();
                    break;
                }
                case 4: {
                    if (num2 != 0) {
                        System.out.println("Your division is: " + ((float) num1 / (float) num2));
                        System.out.println();
                    } else {
                        System.out.println("Number can't be divisible by zero");
                        System.out.println();
                    }
                    break;
                }
                case 5: {
                    System.out.println("Your modulus is: " + (num1 % num2));
                    System.out.println();
                    break;
                }
            }
        }
    }
}
