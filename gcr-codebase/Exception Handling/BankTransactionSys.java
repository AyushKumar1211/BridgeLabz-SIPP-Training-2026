// 10. Bank Transaction System (Checked + Custom Exception)
// 💡 Problem Statement:
// Develop a Bank Account System where:
// withdraw(double amount) method:
// Throws InsufficientBalanceException if withdrawal amount exceeds balance.
// Throws IllegalArgumentException if the amount is negative.
// Handle exceptions in main().
// Expected Behavior:
// If valid, print "Withdrawal successful, new balance: X".
// If balance is insufficient, throw and handle "Insufficient balance!".
// If the amount is negative, throw and handle "Invalid amount!".


public class BankTransactionSys {
    double balance = 5000;
    public void withdraw(double amount)
            throws InsufficientBalanceException {
        if(amount < 0) {
            throw new IllegalArgumentException();
        }
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance = balance - amount;
        System.out.println(
            "Withdrawal successful, new balance: " + balance
        );
    }
    public static void main(String[] args) {
        BankTransactionSys account = new BankTransactionSys();
        try {
            account.withdraw(6000);
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}