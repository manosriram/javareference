import java.io.*;
import java.util.*;

class nameEr extends Exception {
    nameEr(String s) {
        System.out.println(s);
    }
}

class ageEr extends Exception {
    ageEr(String s) {
        System.out.println(s);
    }
}

class bothEx extends Exception {
    bothEx(String s) {
        System.out.println(s);
    }
}

class Employee {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String name = "";
        int age = -1;
        try {
            name = in.next();
            age = in.nextInt();

            if (Character.isDigit(name.charAt(0)) && age > 50) {
                throw new bothEx("Name is not a String and Age is Greater than 50..");
            }

            if (Character.isDigit(name.charAt(0))) {
                throw new nameEr("Name isn't a String.");
            }
            if (age > 50) {
                throw new ageEr("Age is greater than 50");
            }
        } catch (nameEr er1) {
            System.out.println("");
        } catch (ageEr er2) {
            System.out.println("");
        } catch (bothEx er3) {
            System.out.println("");
        } finally {
            System.out.println("Age : " + age + '\n' + "Name : " + name);
        }
    }
}