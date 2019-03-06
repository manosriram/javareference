import java.util.*;

class demo {
    int i, j;

    demo(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class test {
    public static void main(String args[]) {
        ArrayList<demo> o = new ArrayList<demo>();
        o.add(new demo(2, 3));
        o.add(new demo(9, 4));

        for (demo num : o) {
            System.out.println(num.i);
        }
    }
}