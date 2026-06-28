class InsufficientBalanceException extends Exception {
    int balance;
    int withdraw;

    public InsufficientBalanceException(int balance, int withdraw) {
        super("Insufficient balance!");
        this.balance = balance;
        this.withdraw = withdraw;
    }
}
public class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        int amount = 8000;

        try {
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful");

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Balance: " + e.balance);
            System.out.println("Requested: " + e.withdraw);
        }
    }
}