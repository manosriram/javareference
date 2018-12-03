import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class commonElements {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int t, i, j;
        int a[] = new int[n1];
        int b[] = new int[n2];
        int c[] = new int[n1 + n2];

        for (t = 0; t < n1; t++) {
            a[t] = in.nextInt();
            c[t] = a[t];
        }
        // t++;
        for (int t1 = 0; t1 < n2; t1++) {
            b[t1] = in.nextInt();
            c[t] = b[t1];
            t++;
        }
        int i1, j1;
        int count = 0;

        for (t = 0; t < c.length; t++) {
            for (i = 0; i < c.length - t; i++) {
                if (t != i) {
                    if (c[t] == c[i]) {
                        count++;
                        for (int u = t; u < c.length - 1; u++)
                            c[u] = c[u + 1];
                    }
                }
            }
        }

        Arrays.sort(c);
        for (int t1 = 0; t1 < c.length - count; t1++) {
            System.out.print(c[t1] + " ");
        }

        in.close();
    }
}