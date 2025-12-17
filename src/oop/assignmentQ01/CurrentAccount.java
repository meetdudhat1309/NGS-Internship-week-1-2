package oop.assignmentQ01;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNo, String accHolderName, int balance) {
        super(accountNo, accHolderName, balance);
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0) {
            if (amount <= super.getBalance()) {
                super.withdraw(amount);
                System.out.println("Amount withdraw: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Enter valid amount!!");
        }
    }
}
