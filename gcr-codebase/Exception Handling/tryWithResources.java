// 5. try-with-resources (Auto-closing Resources)
// 💡 Problem Statement:
// Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
// Use try-with-resources to ensure the file is automatically closed after reading.
// Handle any IOException that may occur.
// Expected Behavior:
// If the file exists, print its first line.
// If the file does not exist, catch IOException and print "Error reading file".

import java.io.*;
public class tryWithResources {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        }
        catch(IOException e) {
            System.out.println("Error reading file");
        }
    }
}