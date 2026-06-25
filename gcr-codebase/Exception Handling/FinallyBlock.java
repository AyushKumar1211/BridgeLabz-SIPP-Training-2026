// 7. finally Block Execution
// 💡 Problem Statement:
// Write a program that performs integer division and demonstrates the finally block execution.
// The program should:
// Take two integers from the user.
// Perform division.
// Handle ArithmeticException (if dividing by zero).
// Ensure "Operation completed" is always printed using finally.
// Expected Behavior:
// If valid, print the result.
// If an exception occurs, handle it and still print "Operation completed".


import java.util.Scanner;
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Result: " + a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Operation completed");
        }
        sc.close();
    }
}