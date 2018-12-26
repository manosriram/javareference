import java.io.*;
import java.util.*;

class varCol {
    public static void main(String args[]) {
        int r, c;
        int i, j, d;
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        int a[][] = new int[r][];

        for (i = 0; i < r; i++) {
            System.out.print("Number of Columns for this row : ");
            d = in.nextInt();
            a[i] = new int[d];
            for (j = 0; j < d; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < r; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}