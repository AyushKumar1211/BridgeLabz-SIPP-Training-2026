// 4. Grocery Bill Reader
// Scenario:
//  A grocery store saves daily bills in a text file.
// Task:
//  Write a program that:
// Read the contents of bill.txt.
// Displays each line on the console.
// Counts the total number of lines in the file.
// Concepts: FileReader, BufferedReader

import java.io.*;

public class GroceryBill {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("bill.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            System.out.println("Total lines = " + count);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}