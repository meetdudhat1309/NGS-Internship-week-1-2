package exception.exQ02;

import java.util.Scanner;

public class ExceptionQ2 {
//    Q1: Online Examination System Error Handling
//    Create a module for an online examination system that processes student responses.
//    Requirements:
//    Validate that:
//    Student ID is not null.
//    Answer submission is within the allowed time limit.
//    If submission time exceeds the limit, throw a custom unchecked exception.
//    Handle multiple exceptions using multiple catch blocks.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String studentID = sc.next();
        System.out.print("Enter Time to complete an exam(in hr): ");
        float timeToCompleteExam = sc.nextFloat();

        Student st = new Student(studentID, timeToCompleteExam);
        try {
            st.submitDetails();
        } catch (InvalidIdException | ExamTimeExceedException e) {
            e.printStackTrace();
        }

    }
}

