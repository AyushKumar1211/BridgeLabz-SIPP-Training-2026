// 2. Customer Feedback Analyzer
// An online store receives customer feedback.
// Using BufferedReader:
// Read 5 feedback messages.
// Count how many messages contain the word:
// good
// Display the count.
// Example  
// Good service
// delivery was good
// average
// good packaging
// late delivery											
// Output:
// Good Feedback Count = 3

import java.io.*;

public class Feedback {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        System.out.println("Enter 5 feedback messages:");

        for (int i = 0; i < 5; i++) {
            String msg = br.readLine();

            if (msg.toLowerCase().contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);
    }
}