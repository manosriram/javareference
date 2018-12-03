import java.io.*;

class pal {
    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String st = b.readLine();
        int i = 0, j = st.length() - 1;
        int count = 0;
        while (i < j) {
            if (st.charAt(i) == st.charAt(j)) {
                i++;
                j--;
                count++;
            } else
                break;
        }

        if (count == st.length() / 2)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome!");

        // System.out.println(st);
    }
}