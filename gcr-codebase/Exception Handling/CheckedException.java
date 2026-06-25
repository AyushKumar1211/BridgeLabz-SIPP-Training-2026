// 1. Checked Exception (Compile-time Exception)
// 💡 Problem Statement:
// Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
// Expected Behavior:
// If the file exists, print its contents.
// If the file does not exist, catch the IOException and print "File not found".

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}