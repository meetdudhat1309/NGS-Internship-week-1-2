package oop.assignmentQ01;

public abstract class BankAccount {

    private final String accountNo;
    private final String accHolderName;
    private int balance;

    public BankAccount(String accountNo, String accHolderName, int balance) {
        this.accountNo = accountNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount credited: " + amount);
        } else {
            System.out.println("Enter valid amount!!");
        }
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }


    public void getAccDetails() {
        System.out.println("************************************************************************");
        System.out.println("Account No.: " + accountNo);
        System.out.println("Account holder name: " + accHolderName);
        System.out.println("Available balance: " + balance);
        System.out.println("************************************************************************");
    }
}
