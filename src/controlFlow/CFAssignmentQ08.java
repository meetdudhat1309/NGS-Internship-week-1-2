package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ08 {
//    TODO: Practical 8: Prime Number Range Checker
//    Write a program that:
//    Takes two numbers start and end
//    Prints all prime numbers between them
//    Use:
//    Nested loops
//    break to stop checking divisibility early
//    Also count total prime numbers found

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int st = sc.nextInt();
        System.out.print("Enter ending number: ");
        int en = sc.nextInt();
        int primeCnt = 0;
        boolean isPrime = true;
        int factorCnt = 0;

        for (int i = st; i <= en; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factorCnt++;
                    if (factorCnt > 2) {
                        isPrime = false;
                        factorCnt = 0;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i+" ");
                primeCnt++;
            }
            isPrime = true;
        }
        System.out.println("Total prime number: "+primeCnt);
    }
}
