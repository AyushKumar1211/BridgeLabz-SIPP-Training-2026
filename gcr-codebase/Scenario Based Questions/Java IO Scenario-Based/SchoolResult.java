// 1. A school result portal reads student names and marks from a text file,
//  computes averages, and writes a formatted report card to a new file.
// Handle FileNotFoundException gracefully. Extend: append new results 
// without overwriting old ones. 
import java.io.*;
import java.util.*;

public class SchoolResult {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true)); // append mode

            String name;
            int total = 0, count = 0;

            while ((name = br.readLine()) != null) {
                int marks = Integer.parseInt(br.readLine());

                total += marks;
                count++;

                bw.write("Name: " + name + " Marks: " + marks);
                bw.newLine();
            }

            double avg = total / count;
            bw.write("Average Marks: " + avg);
            bw.newLine();

            br.close();
            bw.close();

            System.out.println("Report card saved");

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}