package controlFlow;

import java.util.Random;
import java.util.Scanner;

public class CFAssignmentQ10 {
//    TODO: Problem 10: Number Guessing Game
//    Develop a program where:
//    A fixed number (e.g., 57) is already set
//    User guesses the number
//    Program should:
//    Indicate Too High, Too Low, or Correct
//    Allow guessing until correct number is found
//    Count number of attempts
//    Use while or do–while loop

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = new Random().nextInt(100);
        int attempts = 0;
        while (true) {
            System.out.println("********************************************************************");
            System.out.print("Enter your number: ");
            attempts++;
            int guessedNum = sc.nextInt();
            if (num == guessedNum) {
                System.out.println("WOW! You guessed the number in "+attempts+" attempts:), The number is: "+ num);
                break;
            } else if (num < guessedNum) {
                System.out.println("Your number is too high");
            } else {
                System.out.println("Your number is too low");
            }
        }
    }
}
