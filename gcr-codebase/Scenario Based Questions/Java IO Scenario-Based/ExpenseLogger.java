// 3. Daily Expense Logger
// A finance application stores daily expenses.
// Create a program that:
// Accepts expense details from user.
// Stores them in:
// expenses.txt

// Format:
// Food - 200
// Travel - 150
// Shopping - 500

// Each new entry should be appended without deleting previous data.

import java.io.*;
import java.util.*;

public class ExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("expenses.txt", true); // append mode

            System.out.print("Enter category: ");
            String category = sc.nextLine();

            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            fw.write(category + " - " + amount);
            fw.write("\n");

            fw.close();

            System.out.println("Expense saved");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}