package oop.assignmentQ01;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNo, String accHolderName, int balance) {
        super(accountNo, accHolderName, balance);
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0) {
            if (amount <= super.getBalance()) {
                if (amount < 50000) {
                    super.withdraw(amount);
                    System.out.println("Amount withdraw: " + amount);
                }else {
                    System.out.println("You can't withdraw more than 50,000 at a time!");
                }
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Enter valid amount!!");
        }
    }
}
