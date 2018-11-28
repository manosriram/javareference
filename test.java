import java.io.*;
import java.util.*;

class test {
    public static void main(String args[]) throws IOException {
        int arr[];
        Integer t, n;
        // Create a Input Source.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number of Elements : ");

        // Get n.
        n = Integer.parseInt(br.readLine());

        // Create an array with n elements dynamically.
        int a[] = new int[n];

        // Read Multiple Integers Line.
        String line = br.readLine();
        String[] strs = line.trim().split("\\s+");

        // Read the String in a Single Line while converting them into Integers..
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }

        // Print the Intgers!
        for (t = 0; t < strs.length; t++) {
            System.out.println("Element at " + (t + 1) + " is " + strs[t]);
        }
    }
}