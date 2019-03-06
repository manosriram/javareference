import java.io.*;
import java.util.*;

// User defined Exception for Student who is already present.
class StudentAlreadyExistsException extends Exception {
    StudentAlreadyExistsException(String s) {
        System.out.println(s);
    }
}

class Department {
    protected String deptName[] = { "CSE", "ECE", "EEE", "Civil", "Mechanical", "Bio-Chem" }; // Departments Available.
    protected String dep;
    protected String deptHead;

    void registerDepartment(Department ob, int i) {
        switch (i) {
        case 1:
            ob.dep = deptName[0];
            break;
        case 2:
            ob.dep = deptName[1];
            break;
        case 3:
            ob.dep = deptName[2];
            break;
        case 4:
            ob.dep = deptName[3];
            break;
        case 5:
            ob.dep = deptName[4];
            break;
        case 6:
            ob.dep = deptName[5];
            break;
        }
    }
}

// Class Student .
class Student extends Department {

    private long studentId;
    private String studentName;
    private int creditScore;

    // Checks if the ID of the Student is already registered or not.
    boolean checkStudent(long id[], long newId) {
        for (int t = 0; t < id.length; t++) {
            if (id[t] == newId)
                return false;
        }
        return true;
    }

    // Enrolls the Student to the List with Information.
    int enrollStudent(long id[], Student ob, ArrayList<Student> arr, int count) {
        try {
            if (checkStudent(id, ob.studentId) == true) {
                id[count] = ob.studentId;
                count++;
                arr.add(ob);
            } else
                throw new StudentAlreadyExistsException("");
        } catch (StudentAlreadyExistsException er) {
            System.out.println(er);
        }
        return count;
    }

    // Storing Information in an Object before performing Checks.
    void takeStudent(String name, long id, int creditScore, Department d) {
        this.studentId = id;
        this.studentName = name;
        this.dep = d.dep;
        this.creditScore = creditScore;
    }

    // Sorting the ArrayList in Descending Order of Credit Score.
    void sortAr(ArrayList<Student> arr, Student o1, Student o2) {
        Collections.sort(arr, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.valueOf(s2.creditScore).compareTo(s1.creditScore);
            }
        });

        // Printing the Sorted Information.
        for (int t = 0; t < arr.size(); t++) {
            System.out.println();
            System.out.println("----------------------------------------------------");
            System.out.println("Student " + (t + 1) + " : ");
            System.out.println();
            System.out.println("Name : " + arr.get(t).studentName);
            System.out.println("Department : " + arr.get(t).dep);
            System.out.println("Id : " + arr.get(t).studentId);
            System.out.println("Credit Score : " + arr.get(t).creditScore);
            System.out.println("----------------------------------------------------");
            System.out.println();
        }

    }

    // Get all Students from the given Department.
    void getStudentsByDepartment(String deptName, ArrayList<Student> arr) {
        int count = 0;
        System.out.println();
        System.out.println();
        System.out.println("--------------------------  Department " + deptName + " --------------------------");
        System.out.println();
        for (int t = 0; t < arr.size(); t++) {
            if (arr.get(t).dep == deptName) { // If the Entered Department matches the department in the list.
                count++;
                System.out.println(count + " " + arr.get(t).studentName);
                System.out.println();
            }
        }
        if (count == 0) {
            System.out.println("No Students Found..");
            System.out.println();
        }

        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println();
    }
}

class CS1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();
        int cnt = 0;

        long id[] = new long[30];
        int ch, ch1;

        // Base Loop which runs until we exit.
        while (true) {
            System.out.println();
            System.out.print("1.Enroll Student. 2.Get Students By Department. 3.Display All Students. 4.Exit : ");
            ch = in.nextInt(); // get the option of the user.

            Department d = new Department();
            String name;
            long newId;
            int score;

            Student s = new Student();

            switch (ch) {

            case 1:
                // Enroll Student .
                Student o = new Student();

                // Get name of student from User.
                System.out.print("Name : ");
                name = in.next();

                // Get Department of Student from User.
                try {
                    System.out.print(
                            "Choose Department : \n1.CSE.\n2.ECE.\n3.EEE.\n4.Civil.\n5.Mechanical.\n6.Bio-Chem\n");
                    ch1 = in.nextInt();

                    if (ch1 > 6 || ch1 < 0)
                        throw new Exception("");

                    d.registerDepartment(d, ch1);

                } catch (Exception e) {
                    System.out.println(e);
                }

                // Get Student ID from User.
                System.out.print("Id : ");
                newId = in.nextLong();

                // Get Credit Score of Student from User.
                System.out.print("Credit Score : ");
                score = in.nextInt();

                o.takeStudent(name, newId, score, d);
                cnt = s.enrollStudent(id, o, arr, cnt);

                break;

            case 2:
                // Get Students by Department
                System.out.print("Choose Department : \n1.CSE.\n2.ECE.\n3.EEE.\n4.Civil.\n5.Mechanical.\n6.Bio-Chem\n");
                try {
                    ch1 = in.nextInt();

                    if (ch1 > 6 || ch1 < 0)
                        throw new ArithmeticException("");

                    switch (ch1) {

                    case 1:
                        s.getStudentsByDepartment("CSE", arr);
                        break;
                    case 2:
                        s.getStudentsByDepartment("ECE", arr);
                        break;
                    case 3:
                        s.getStudentsByDepartment("EEE", arr);
                        break;
                    case 4:
                        s.getStudentsByDepartment("Civil", arr);
                        break;
                    case 5:
                        s.getStudentsByDepartment("Bio-Chem", arr);
                        break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Department not Found.");
                }
                break;

            case 3:
                // Sort ArrayList in a descending order with respect to Credit Score.
                Student o1 = new Student();
                Student o2 = new Student();
                s.sortAr(arr, o1, o2);
                break;

            case 4:
                // Exits the Program.
                System.exit(0);

                // When any of the above option is not chosen.
            default:
                System.out.println("Option not Found..");
            }
        }

    }
}