package controlFlow;

import java.util.Scanner;

public class CFAssignmentQ07 {
//    TODO: Problem 7: Login Authentication System
//    Write a program that:
//    Allows maximum 3 login attempts
//    Predefined username and password
//    If credentials match → print "Login Successful" and exit
//    After 3 failed attempts → print "Account Locked"
//    Use loop + if–else

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "MeetMeMeet";
        String password = "13092004";

        int cnt = 3;

        while (cnt>0){
            System.out.println("**********************************************************************");
            System.out.print("Enter username: ");
            String uName = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if (uName.equals(username) && pass.equals(password)){
                System.out.println("Login Successfully:)");
                break;
            }else {
                System.out.println("Wrong Credentials!");
            }
            cnt--;
            if (cnt ==0){
                System.out.println("Account Locked!!");
            }
        }
    }
}
