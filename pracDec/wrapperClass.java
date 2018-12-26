import java.io.*;
import java.util.Vector;

class one {
    int y = 01;

    one() {
        System.out.println("Hey !!");
    }

}

class two extends one {
    two() {
        System.out.println(super.y);
    }
}

class wrapperClass {
    public static void main(String args[]) {
        String a[] = new String[10];
        Vector v = new Vector();
        v.addElement("Mano");
        v.addElement("Sriram");
        v.copyInto(a);

        two o = new two();
        // v.elementAt(0);
        // System.out.println();
        // v.elementAt(1);

        // System.out.println(a[1]);

    }
}