package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ05 {
//    TODO: Problem 5: Pattern-Based Number Analysis
//    Write a program that:
//    Takes a number n
//    Prints numbers from 1 to n
//    But:
//    Skip numbers divisible by 3 using continue
//    Stop execution when a number divisible by 7 is encountered using break
//    Display how many numbers were skipped

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i=1; i<=num; i++){
            if (i%3==0) continue;
            if (i%7==0) break;
            System.out.print(i+" ");
        }
    }
}
