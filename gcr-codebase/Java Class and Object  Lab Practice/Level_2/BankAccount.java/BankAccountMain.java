public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rahul", 12345, 10000);
        b1.deposit(5000);
        b1.withdraw(3000);
        b1.displayBalance();
    }
}
