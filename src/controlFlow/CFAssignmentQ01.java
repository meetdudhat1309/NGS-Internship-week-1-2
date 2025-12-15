package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ01 {
//    TODO: Problem 1: Student Grade Evaluation System
//    Write a Java program that takes marks of 5 subjects as input.
//    Calculate total marks and percentage
//    Use if–else–if ladder to assign grades:
//    A+ (≥ 90%)
//    A (80–89%)
//    B (70–79%)
//    C (60–69%)
//    Fail (< 60%)
//    Also check:
//    If any subject marks < 35, student should be marked Fail, regardless of percentage.
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        boolean isFail = false;

        for (int i=0; i<5; i++){
            System.out.print("Enter mark "+(i+1)+": ");
            marks[i] = sc.nextInt();
            total+=marks[i];
            if (marks[i]<35) isFail = true;
        }

        System.out.println("Total marks: "+ total);
        float percentage = (total/5f);
        System.out.println("Percentage marks: "+percentage);

        if (isFail) System.out.println("Grade: FAIL");
        else if (percentage>=90) System.out.println("Grade: A+");
        else if(percentage>=80) System.out.println("Grade: A");
        else if(percentage>=70) System.out.println("Grade: B");
        else if(percentage>=60) System.out.println("Grade: C");
        else System.out.println("Grade: FAIL");
    }
}
