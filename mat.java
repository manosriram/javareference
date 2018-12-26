import java.io.*;
import java.util.*;

class mat {
    public static void main(String args[]) {
        int i, j, r, c;
        Scanner in = new Scanner(System.in);

        r = in.nextInt();
        c = in.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = in.nextInt();
                a[i][j] *= b[i][j];
            }
        }

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
