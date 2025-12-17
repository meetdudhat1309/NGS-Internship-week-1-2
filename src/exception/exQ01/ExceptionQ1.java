package exception.exQ01;

public class ExceptionQ1 {
//    Q1: Banking Transaction Validation System
//        Design a Java application to simulate a banking transaction system where users can deposit and withdraw money.
//        Requirements:
//        Validate withdrawal amount against available balance.
//        Do not allow negative or zero transaction amounts.
//        If the withdrawal amount exceeds balance, throw a custom checked exception named InsufficientBalanceException.

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);
        System.out.println(acc.balance);

        try {
            acc.depositAmount(-200);
        } catch (InvalidAmountException e) {
            System.out.println(e);
        }

        try {
            acc.depositAmount(1000);
        } catch (InvalidAmountException e) {
            System.out.println(e);
        }

        System.out.println(acc.balance);
        try {
            acc.withDrawAmount(-1000);
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println(e);
        }

        try {
            acc.withDrawAmount(8000);
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println(e);
        }

        try {
            acc.withDrawAmount(500);
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println(e);
        }
        System.out.println(acc.balance);
    }
}

