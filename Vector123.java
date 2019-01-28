import java.io.*;
import java.util.*;

class Vector123 {
    public static void main(String args[]) {
        Vector v = new Vector<Number>();
        v.addElement("mano");
        v.addElement(123);

        // for (int t = 0; t < v.size(); t++) {
        System.out.println(v);
        // }
    }
}