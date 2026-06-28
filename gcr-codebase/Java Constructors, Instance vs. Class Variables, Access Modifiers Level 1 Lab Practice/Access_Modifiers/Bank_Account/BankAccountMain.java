public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, "Arjun", 5000, 4.5);
        sa.display();
        sa.deposit(2000);
        sa.display();
        sa.withdraw(3000);
        sa.display();
    }
}
