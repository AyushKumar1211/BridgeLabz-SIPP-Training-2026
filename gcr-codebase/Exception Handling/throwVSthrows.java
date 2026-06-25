// 6. throw vs. throws (Exception Propagation)
// 💡 Problem Statement:
// Create a method calculateInterest(double amount, double rate, int years) that:
// Throws IllegalArgumentException if amount or rate is negative.
// Propagates the exception using throws and handles it in main().
// Expected Behavior:
// If valid, return and print the calculated interest.
// If invalid, catch and display "Invalid input: Amount and rate must be positive".

public class throwVSthrows {
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {
        if(amount < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }
        return (amount * rate * years) / 100;
    }
    public static void main(String[] args) {
        try {
            double result = calculateInterest(10000, 5, 2);
            System.out.println("Interest: " + result);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}