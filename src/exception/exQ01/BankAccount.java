package exception.exQ01;

class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void depositAmount(int amount) throws InvalidAmountException {
        if (amount < 0) throw new InvalidAmountException("Amount must be grater than 0!");
        balance += amount;
    }

    public void withDrawAmount(int amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount < 0) throw new InvalidAmountException("Amount must be grater than 0!");
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
    }

}
