import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

class basic1 {
    public static void main(String args[]) throws  IOException {
        Hashtable h1 = new Hashtable();
        int t;

        Scanner n = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        a = Integer.parseInt(br.readLine());
         int l = n.nextInt();
        String str = n.next();
        char st[];
        // a = new int[l];

        for (t = 0; t < str.length(); t++) {
            char a = str.charAt(t);
            h1.put(a, t + 1);
        }

        Enumeration e1 = h1.keys();
        st = new char[10];

        for (t = 0; t < h1.size(); t++) {
            st[t] = (char) e1.nextElement();
            // System.out.print(st[t]);
        }
        System.out.print((st[3]));
    }
        System.out.println(a);
    }
}