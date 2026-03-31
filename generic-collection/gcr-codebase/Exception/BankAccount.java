class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount! Amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.printf("Withdrawal successful, new balance: $%.2f%n", balance);
    }
}

public class BankTransactionSystem {
    public static void main(String args) {
        BankAccount account = new BankAccount(500.00);

        try {
            account.withdraw(100.00);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        try {
            account.withdraw(1000.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    \
        try {
            account.withdraw(-50.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}